



public class Renfort {

    public Joueur j;



    public void ajout_unite(String [] tabTerritoire, Armee [] tab,  Carte c, Joueur j, Joueur j1, Joueur j2, Joueur j3, Joueur j4, Joueur j5, Joueur j6 ) {

                ArrayList al = j.getListeTerritoire();
                int L = al.size();

                int renfort = floor(L/3);

                int limiteUnite = 0;




                public int ajoutArmee(String unite, String terri, ActionOrdi o, int l, int p, int i, int n, int m, Carte c, Armee a) {
                        if (l >= m) {
                        int num = 0;

                        switch (unite) {
                        case "canon" : num = a.getCanon(); break;
                        case "cavalier" : num =  a.getCavalier(); break;
                        case "soldat" : num = a.getSoldat(); break;
                        }

                        c.afficherMessage("Joueur " + i + " (reste " +l+ " unit�(s))", terri + " a une puissance de " + p, "Combien de " + unite + "? (d�j� " + num + ")", "");

                        int u = o.touchePresse();

                        if (l >= u*m) {
                            switch (unite) {
                                case "canon" : a.setCanon(u); break;
                                case "cavalier" : a.setCavalier(u); break;
                                case "soldat" : a.setSoldat(u); break;
                            }
                            l = l - m*u;
                        }

                         else {
                             c.afficherMessage("", "", "", "Nombre d'unit� restant insuffisant");
                            StdDraw.pause(3000);
                            }
                    }
            return l;
             }



                limiteUnite = renfort ;

                while (limiteUnite != 0) {

                ActionOrdi o = new ActionOrdi();

                int k = o.click(c);
                 String terri = tabTerritoire[k];
                Armee a = tab[k];
                int p = a.puissance();

                limiteUnite = ajoutArmee("canon", terri, o, limiteUnite, p, i, n, 7, c, a);
                p = a.puissance();

                c.AfficherCarte();
                c.afficherTerritoire(tab, j1, j2, j3, j4, j5, j6, n);

                limiteUnite = ajoutArmee("cavalier", terri, o, limiteUnite, p, i, n, 3, c, a);
                p = a.puissance();

                c.AfficherCarte();
                c.afficherTerritoire(tab, j1, j2, j3, j4, j5, j6, n);

                limiteUnite = ajoutArmee("soldat", terri, o, limiteUnite, p, i, n, 1, c, a);
                 p = a.puissance();

                c.AfficherCarte();
                c.afficherTerritoire(tab, j1, j2, j3, j4, j5, j6, n);

                tab[k] = a;
        }






        }


