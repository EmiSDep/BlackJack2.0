package com.emisdep;

import com.emisdep.Utils.Console;
import com.emisdep.cardGame.actor.Dealer;
import com.emisdep.cardGame.actor.Player;
import com.emisdep.cardGame.blackJack.Actor;
import com.emisdep.cardGame.blackJack.Hand;
import com.emisdep.cardGame.blackJack.Table;
import com.emisdep.cardGame.deck.Deck;
import com.emisdep.cardGame.deck.RiggedDeck;
import com.emisdep.cardGame.deck.StandardDeck;
import com.sun.tools.jconsole.JConsoleContext;

public class Main {

    public static void main(String[] args) {
        Table table = new Table();

        table.playGame();
    }
}
