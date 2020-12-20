package com.github.nickbaynham.ReviewAnalyzer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReviewAnalyzerApplicationTests {

        private ReviewAnalyzerApplication anayzer = new ReviewAnalyzerApplication();

	@Test
	void testWordCount() {
            assertEquals(7, analyzer.getWordCount("Train to win in the digital economy"));
	}

}
