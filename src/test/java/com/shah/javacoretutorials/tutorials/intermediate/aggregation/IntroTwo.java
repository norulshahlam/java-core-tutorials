package com.shah.javacoretutorials.tutorials.intermediate.aggregation;

import com.shah.javacoretutorials.model.School;
import com.shah.javacoretutorials.model.StudentSch;
import org.junit.jupiter.api.Test;

/*
Aggregation
*/
class IntroTwo {
	@Test
	void test() {

		School s = new School("Oxford", "London");
		StudentSch a = new StudentSch("shah", s);
		System.out.println(a);
	}
}

