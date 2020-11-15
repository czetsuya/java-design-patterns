package com.czetsuya.designpatterns.behavioral.strategy;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {

        JobRecommendation jr = new JobRecommendation();
        jr.setAlgorithm(new CollaborativeRecommendationAlgorithm());
        System.out.println(jr.computeRecommendation());

        jr.setAlgorithm(new ContentBasedRecommendationAlgorithm());
        System.out.println(jr.computeRecommendation());
    }

}
