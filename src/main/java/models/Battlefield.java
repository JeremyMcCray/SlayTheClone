package models;

import java.util.ArrayList;

public class Battlefield {
    ArrayList<Unit> playerUnits;
    ArrayList<Unit> enemyUnits;

    public Battlefield(ArrayList<Unit> playerUnits, ArrayList<Unit> enemyUnits) {
        this.playerUnits = playerUnits;
        this.enemyUnits = enemyUnits;
    }

    public Unit getEnemyFrontUnit(){
        if(enemyUnits.size() > 0){
            return enemyUnits.get(0);
        }
        else return null;
    }

    public Unit getPlayerFrontUnit(){
        if(playerUnits.size() > 0){
            return playerUnits.get(0);
        }
        else return null;
    }

    public ArrayList<Unit> getPlayerUnits() {
        return playerUnits;
    }

    public void setPlayerUnits(ArrayList<Unit> playerUnits) {
        this.playerUnits = playerUnits;
    }

    public ArrayList<Unit> getEnemyUnits() {
        return enemyUnits;
    }

    public void setEnemyUnits(ArrayList<Unit> enemyUnits) {
        this.enemyUnits = enemyUnits;
    }

    public void placePlayerUnit(Unit unit, int position){
       playerUnits.add(position,unit);
    }

    public void placeEnemyUnit(Unit unit, int position){
        enemyUnits.add(position,unit);
    }
}
