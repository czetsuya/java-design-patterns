package com.czetsuya.designpatterns.behavioral.strategy;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
class CollaborativeRecommendationAlgorithm implements Recommendation {

    @Override
    public String compute() {
        return "Collaborative";
    }

}
