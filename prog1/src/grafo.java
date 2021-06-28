public class grafo {
    int grafo[][] = new int[5][5];

    boolean checaviznho(int v1,int v2,int grafo[][])
    {
        if((grafo[v1][v2] == 1) || (grafo[v2][v1] == 1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void vizinhos(int v1,int grafo[][])
    {
        for(int i=0;i<5;i++)
        {
            if(checaviznho(v1,i,grafo))
            {
                System.out.println("O vertice "+(i+1)+" é viznho de "+(v1+1));
            }
        }
    }
   }


