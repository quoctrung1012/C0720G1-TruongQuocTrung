package case_study_v1.models;

import java.util.List;

public class Dictionarys {
    private String word;
    private String pronoun;
    private String noun;
    private String adjective;
    private String verb;
    private List<String> synonymous ;


    public Dictionarys() {
    }

    public Dictionarys(String word, String pronoun, String noun, String adjective, String verb, List<String> synonymous) {
        this.word = word;
        this.pronoun = pronoun;
        this.noun = noun;
        this.adjective = adjective;
        this.verb = verb;
        this.synonymous = synonymous;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public List<String> getSynonymous() {
        return synonymous;
    }

    public void setSynonymous(List<String> synonymous) {
        this.synonymous = synonymous;
    }

    @Override
    public String toString() {
        return "Dictionarys{" +
                "word='" + word + '\'' +
                ", pronoun='" + pronoun + '\'' +
                ", noun='" + noun + '\'' +
                ", adjective='" + adjective + '\'' +
                ", verb='" + verb + '\'' +
                ", synonymous=" + synonymous +
                '}';
    }
}
