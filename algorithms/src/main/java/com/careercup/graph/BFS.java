package com.careercup.graph;


import java.util.LinkedList;

public class BFS {

    /*
     * Performs a breadth-first search on a graph
     * @param {array} graph - Graph, represented as adjacency lists.
     * @param {data} source - The index of the source vertex.
     * @returns {array} Array of objects describing each vertex, like
     *     [{distance: _, predecessor: _ }]
     */
    public static void doBFS(LinkedList<Integer>[] adjList, int sourceVertexIndex) {

    }

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(0, 1);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(0, 0);
        l2.add(1, 4);
        l2.add(2, 5);

        LinkedList<Integer> l3 = new LinkedList<>();
        l3.add(0, 3);
        l3.add(1, 4);
        l3.add(2, 5);

        LinkedList<Integer> l4 = new LinkedList<>();
        l4.add(0, 2);
        l4.add(1, 6);

        LinkedList<Integer> l5 = new LinkedList<>();
        l5.add(0, 1);
        l5.add(1, 2);

        LinkedList<Integer> l6 = new LinkedList<>();
        l6.add(0, 1);
        l6.add(1, 2);
        l6.add(2, 6);

        LinkedList<Integer> l7 = new LinkedList<>();
        l7.add(0, 3);
        l7.add(1, 5);

        LinkedList<Integer>[] adjList = new LinkedList[8];
        adjList[0] = l1;
        adjList[1] = l2;
        adjList[2] = l3;
        adjList[3] = l4;
        adjList[4] = l5;
        adjList[5] = l6;
        adjList[6] = l7;
        adjList[7] = null;
    }





}
