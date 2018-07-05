package org.leanpoker.player;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class PlayerTest  {

	@Ignore
	public void testBetRequest() {
		// given
    	String test = "{ \"tournament_id\":\"550d1d68cd7bd10003000003\""
    			+ ",  \"game_id\":\"550da1cb2d909006e90004b1\",  "
    			+ "\"round\":0,  \"bet_index\":0,  \"small_blind\": 10,  "
    			+ "\"current_buy_in\": 320,  \"pot\": 400,  \"minimum_raise\": 240,   "
    			+ "\"dealer\": 1,   \"orbits\": 7,   \"in_action\": 1,  "
    			+ "\"players\": [  {  \"id\": 0,  \"name\": \"Albert\",  \"status\": \"active\","
    			+ "      \"version\": \"Default random player\",  \"stack\": 1010,   \"bet\": 320  }, "
    			+ "{ \"id\": 1,  \"name\": \"Bob\", \"status\": \"active\", \"version\": "
    			+ "\"Default random player\", \"stack\": 1590, \"bet\": 80, "
    			+ "\"hole_cards\": [   { \"rank\": \"6\",  \"suit\": \"hearts\"  }, "
    			+ "{ \"rank\": \"K\", \"suit\": \"spades\" } ] }, { \"id\": 2, \"name\": \"Chuck\","
    			+ " \"status\": \"out\", \"version\": \"Default random player\", \"stack\": 0, "
    			+ "\"bet\": 0 } ], \"community_cards\": [  { \"rank\": \"4\", \"suit\": \"spades\" }, "
    			+ "{ \"rank\": \"A\", \"suit\": \"hearts\" }, { \"rank\": \"6\", \"suit\": \"clubs\" } ]}";
    	
    	String test1 = "{ \"current_buy_in\": 320 } ";
    	
    	JsonElement elemnt = new JsonParser().parse(test1);
    	
	// when
	int bet = Player.betRequest(elemnt);
	
		// then
	assertEquals(bet, new Integer("330").intValue());
	}
	
	@Test
	public void testBetRequest_sameRank() {
		// given
		String rank1 = "6";
		String rank2 = "6";
		
    	String testWithCards = "{ \"tournament_id\":\"550d1d68cd7bd10003000003\""
    			+ ",  \"game_id\":\"550da1cb2d909006e90004b1\",  "
    			+ "\"round\":0,  \"bet_index\":0,  \"small_blind\": 10,  "
    			+ "\"current_buy_in\": 320,  \"pot\": 400,  \"minimum_raise\": 240,   "
    			+ "\"dealer\": 1,   \"orbits\": 7,   \"in_action\": 1,  "
    			+ "\"players\": [  {  \"id\": 0,  \"name\": \"Albert\",  \"status\": \"active\","
    			+ "      \"version\": \"Default random player\",  \"stack\": 1010,   \"bet\": 320  }, "
    			+ "{ \"id\": 1,  \"name\": \"japsn\", \"status\": \"active\", \"version\": "
    			+ "\"Default random player\", \"stack\": 1590, \"bet\": 80, "
    			+ "\"hole_cards\": [   "
    			+ "{ \"rank\": \"" + rank1  +"\",  \"suit\": \"hearts\"  }, "
    			+ "{ \"rank\": \"" + rank2  +"\", \"suit\": \"spades\" } ] }, "
    			+ ""
    			+ "{ \"id\": 2, \"name\": \"Chuck\","
    			+ " \"status\": \"out\", \"version\": \"Default random player\", \"stack\": 0, "
    			+ "\"bet\": 0 } ], \"community_cards\": [  { \"rank\": \"4\", \"suit\": \"spades\" }, "
    			+ "{ \"rank\": \"A\", \"suit\": \"hearts\" }, { \"rank\": \"6\", \"suit\": \"clubs\" } ]}";
    	
    	String test1 = "{ \"current_buy_in\": 320 } ";
    	
    	JsonElement elemnt = new JsonParser().parse(testWithCards);
    	
	// when
	int bet = Player.betRequest(elemnt);
	
		// then
	assertEquals(bet, new Integer("330").intValue());
	}

	@Test
	public void testBetRequest_sameColor() {
		// given
		String rank1 = "6";
		String rank2 = "6";
		
    	String testWithCards = "{ \"tournament_id\":\"550d1d68cd7bd10003000003\""
    			+ ",  \"game_id\":\"550da1cb2d909006e90004b1\",  "
    			+ "\"round\":0,  \"bet_index\":0,  \"small_blind\": 10,  "
    			+ "\"current_buy_in\": 320,  \"pot\": 400,  \"minimum_raise\": 240,   "
    			+ "\"dealer\": 1,   \"orbits\": 7,   \"in_action\": 1,  "
    			+ "\"players\": [  {  \"id\": 0,  \"name\": \"Albert\",  \"status\": \"active\","
    			+ "      \"version\": \"Default random player\",  \"stack\": 1010,   \"bet\": 320  }, "
    			+ "{ \"id\": 1,  \"name\": \"japsn\", \"status\": \"active\", \"version\": "
    			+ "\"Default random player\", \"stack\": 1590, \"bet\": 80, "
    			+ "\"hole_cards\": [   "
    			+ "{ \"rank\": \"" + rank1  +"\",  \"suit\": \"hearts\"  }, "
    			+ "{ \"rank\": \"" + rank2  +"\", \"suit\": \"spades\" } ] }, "
    			+ ""
    			+ "{ \"id\": 2, \"name\": \"Chuck\","
    			+ " \"status\": \"out\", \"version\": \"Default random player\", \"stack\": 0, "
    			+ "\"bet\": 0 } ], \"community_cards\": [  { \"rank\": \"4\", \"suit\": \"spades\" }, "
    			+ "{ \"rank\": \"A\", \"suit\": \"hearts\" }, { \"rank\": \"6\", \"suit\": \"clubs\" } ]}";
    	
    	String test1 = "{ \"current_buy_in\": 320 } ";
    	
    	JsonElement elemnt = new JsonParser().parse(testWithCards);
    	
	// when
	int bet = Player.betRequest(elemnt);
	
		// then
	assertEquals(bet, new Integer("330").intValue());
	}
	
}
