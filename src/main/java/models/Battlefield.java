package models;

import cards.UnitCard;

import java.util.ArrayList;

public class Battlefield {
    ArrayList<UnitCard> playerUnits;
    ArrayList<UnitCard> enemyUnits;

    public Battlefield(ArrayList<UnitCard> playerUnits, ArrayList<UnitCard> enemyUnits) {
        this.playerUnits = playerUnits;
        this.enemyUnits = enemyUnits;
    }

    public UnitCard getEnemyFrontUnit(){
        if(enemyUnits.size() > 0){
            return enemyUnits.get(0);
        }
        else return null;
    }

    public UnitCard getPlayerFrontUnit(){
        if(playerUnits.size() > 0){
            return playerUnits.get(0);
        }
        else return null;
    }

    public ArrayList<UnitCard> getPlayerUnits() {
        return playerUnits;
    }

    public void setPlayerUnits(ArrayList<UnitCard> playerUnits) {
        this.playerUnits = playerUnits;
    }

    public ArrayList<UnitCard> getEnemyUnits() {
        return enemyUnits;
    }

    public void setEnemyUnits(ArrayList<UnitCard> enemyUnits) {
        this.enemyUnits = enemyUnits;
    }

    public void placePlayerUnit(UnitCard unit, int position){
       playerUnits.add(position,unit);
    }

    public void placeEnemyUnit(UnitCard unit, int position){
        enemyUnits.add(position,unit);
    }
}
