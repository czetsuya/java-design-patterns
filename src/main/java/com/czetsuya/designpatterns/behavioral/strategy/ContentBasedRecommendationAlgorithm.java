package com.czetsuya.designpatterns.behavioral.strategy;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
class ContentBasedRecommendationAlgorithm implements Recommendation {

    @Override
    public String compute() {
        return "Content-Based";
    }

}
