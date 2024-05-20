#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define MAX_VERTICES 10
#define WHITE 0
#define GREY 1
#define BLACK 2

int color[MAX_VERTICES];
int h[MAX_VERTICES];
int d[MAX_VERTICES];
int f[MAX_VERTICES];
int time = 0;

void DFS(int,int[MAX_VERTICES][MAX_VERTICES]);
void DFS_visit(int, int[MAX_VERTICES][MAX_VERTICES], int);

int main() {
    int v, e;
    printf("Enter the number of vertices: ");
    scanf("%d", &v);
    printf("Enter the number of edges: ");
    scanf("%d", &e);
    int adj[MAX_VERTICES][MAX_VERTICES];
    for (int i = 0; i < v; i++) {
        for (int j = 0; j < v; j++) {
            adj[i][j] = 0;
        }
    }
    printf("Enter the edges (format: source destination):\n");
    for (int i = 0; i < e; i++) {
        int s, d;
        scanf("%d %d", &s, &d);
        adj[s][d] = 1;
    }
    DFS(v,adj);
    printf("Vertex\tDiscovery Time\tFinish Time\n");
    for (int i = 0; i < v; i++) {
        printf("%d\t%d\t\t%d\n", i, d[i], f[i]);
    }
    return 0;
}

void DFS(int g,int adj[MAX_VERTICES][MAX_VERTICES]) {
    int u;
    time = 0;
    for (u = 0; u < g; u++) {
        color[u] = WHITE;
        h[u] = -1;
    }
    for (u = 0; u < g; u++) {
        if (color[u] == WHITE) {
            DFS_visit(u, adj, g);
        }
    }
}

void DFS_visit(int u, int adj[MAX_VERTICES][MAX_VERTICES], int g) {
    color[u] = GREY;
    time = time + 1;
    d[u] = time;
    for (int v = 0; v < g; v++) {
        if (adj[u][v] == 1 && color[v] == WHITE) {
            h[v] = u;
            DFS_visit(v, adj, g);
        }
    }
    color[u] = BLACK;
    time = time + 1;
    f[u] = time;
}
