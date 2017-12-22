package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import antiSpamFilter.AntiSpamFilterAutomaticConfiguration;
import antiSpamFilter.AntiSpamFilterProblem;



public class TestAntiSpamFilterAutomaticConfiguration {
	
	String rulesExample = "jUnitTests/FilesExample/rulesExample.cf";
	String rules2Example = "jUnitTests/FilesExample/rules2Example.cf";
	String spamExample = "jUnitTests/FilesExample/spamExample.log";
	String hamExample = "jUnitTests/FilesExample/hamExample.log";
	
	/**
	 * Test to see if it was created an AntiSpamFilterAutomaticConfiguration object without any problem
	 */
	@Test
	public void automatic() {
		AntiSpamFilterAutomaticConfiguration subjectA = new AntiSpamFilterAutomaticConfiguration();
		AntiSpamFilterAutomaticConfiguration subjectB = new AntiSpamFilterAutomaticConfiguration();		
		
		
		
	}

}
