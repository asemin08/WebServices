package teamsClient;

import java.util.List;
public class MyTeamsClient {

    public static void main(String[] args) {

        TeamsService teamsService = new TeamsService();

        Teams port = teamsService.getTeamsPort();

        List<teamsClient.Team> resultat = port.getTeams();

        for (int i = 0; i < resultat.size(); i++) {
            System.out.println(resultat.get(i).getName());
            System.out.println("Liste des jour de la team " + resultat.get(i).getName() + ": ");

            List<Player> playerResult = resultat.get(i).getPlayers();

            for (int j = 0; j < playerResult.size(); j++) {
                System.out.println(playerResult.get(j).getName() + " " + playerResult.get(j).getNickname());
            }

        }

    }
}