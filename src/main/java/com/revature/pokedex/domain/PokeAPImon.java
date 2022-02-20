package com.revature.pokedex.domain;

import java.util.List;

public class PokeAPImon extends Pokemon{
    private List<Ability> abilities;
    private Long baseExperience;
    private List<Species> forms;
    private List<GameIndex> gameIndices;
    private Long height;
    private List<Object> heldItems;
    private Long id;
    private Boolean isDefault;
    private String locationAreaEncounters;
    private List<Move> moves;
    private String name;
    private Long order;
    private List<Object> pastTypes;
    private Species species;
    private Sprites sprites;
    private List<Stat> stats;
    private List<Type> types;
    private Long weight;

    public List<Ability> getAbilities() { return abilities; }
    public void setAbilities(List<Ability> value) { this.abilities = value; }

    public Long getBaseExperience() { return baseExperience; }
    public void setBaseExperience(Long value) { this.baseExperience = value; }

    public List<Species> getForms() { return forms; }
    public void setForms(List<Species> value) { this.forms = value; }

    public List<GameIndex> getGameIndices() { return gameIndices; }
    public void setGameIndices(List<GameIndex> value) { this.gameIndices = value; }

    public Long getHeight() { return height; }
    public void setHeight(Long value) { this.height = value; }

    public List<Object> getHeldItems() { return heldItems; }
    public void setHeldItems(List<Object> value) { this.heldItems = value; }

    public Long getID() { return id; }
    public void setID(Long value) { this.id = value; }

    public Boolean getIsDefault() { return isDefault; }
    public void setIsDefault(Boolean value) { this.isDefault = value; }

    public String getLocationAreaEncounters() { return locationAreaEncounters; }
    public void setLocationAreaEncounters(String value) { this.locationAreaEncounters = value; }

    public List<Move> getMoves() { return moves; }
    public void setMoves(List<Move> value) { this.moves = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public Long getOrder() { return order; }
    public void setOrder(Long value) { this.order = value; }

    public List<Object> getPastTypes() { return pastTypes; }
    public void setPastTypes(List<Object> value) { this.pastTypes = value; }

    public Species getSpecies() { return species; }
    public void setSpecies(Species value) { this.species = value; }

    public Sprites getSprites() { return sprites; }
    public void setSprites(Sprites value) { this.sprites = value; }

    public List<Stat> getStats() { return stats; }
    public void setStats(List<Stat> value) { this.stats = value; }

    public List<Type> getTypes() { return types; }
    public void setTypes(List<Type> value) { this.types = value; }

    public Long getWeight() { return weight; }
    public void setWeight(Long value) { this.weight = value; }
}

class Ability {
    private Species ability;
    private Boolean isHidden;
    private Long slot;

    public Species getAbility() { return ability; }
    public void setAbility(Species value) { this.ability = value; }

    public Boolean getIsHidden() { return isHidden; }
    public void setIsHidden(Boolean value) { this.isHidden = value; }

    public Long getSlot() { return slot; }
    public void setSlot(Long value) { this.slot = value; }
}

class Species {
    private String name;
    private String url;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
}

class GameIndex {
    private Long gameIndex;
    private Species version;

    public Long getGameIndex() { return gameIndex; }
    public void setGameIndex(Long value) { this.gameIndex = value; }

    public Species getVersion() { return version; }
    public void setVersion(Species value) { this.version = value; }
}

class Move {
    private Species move;
    private List<VersionGroupDetail> versionGroupDetails;

    public Species getMove() { return move; }
    public void setMove(Species value) { this.move = value; }

    public List<VersionGroupDetail> getVersionGroupDetails() { return versionGroupDetails; }
    public void setVersionGroupDetails(List<VersionGroupDetail> value) { this.versionGroupDetails = value; }
}

class VersionGroupDetail {
    private Long levelLearnedAt;
    private Species moveLearnMethod;
    private Species versionGroup;

    public Long getLevelLearnedAt() { return levelLearnedAt; }
    public void setLevelLearnedAt(Long value) { this.levelLearnedAt = value; }

    public Species getMoveLearnMethod() { return moveLearnMethod; }
    public void setMoveLearnMethod(Species value) { this.moveLearnMethod = value; }

    public Species getVersionGroup() { return versionGroup; }
    public void setVersionGroup(Species value) { this.versionGroup = value; }
}

class Sprites {
    private String backDefault;
    private Object backFemale;
    private String backShiny;
    private Object backShinyFemale;
    private String frontDefault;
    private Object frontFemale;
    private String frontShiny;
    private Object frontShinyFemale;
    private Sprites animated;

    public String getBackDefault() { return backDefault; }
    public void setBackDefault(String value) { this.backDefault = value; }

    public Object getBackFemale() { return backFemale; }
    public void setBackFemale(Object value) { this.backFemale = value; }

    public String getBackShiny() { return backShiny; }
    public void setBackShiny(String value) { this.backShiny = value; }

    public Object getBackShinyFemale() { return backShinyFemale; }
    public void setBackShinyFemale(Object value) { this.backShinyFemale = value; }

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public Object getFrontFemale() { return frontFemale; }
    public void setFrontFemale(Object value) { this.frontFemale = value; }

    public String getFrontShiny() { return frontShiny; }
    public void setFrontShiny(String value) { this.frontShiny = value; }

    public Object getFrontShinyFemale() { return frontShinyFemale; }
    public void setFrontShinyFemale(Object value) { this.frontShinyFemale = value; }

    public Sprites getAnimated() { return animated; }
    public void setAnimated(Sprites value) { this.animated = value; }
}

class Stat {
    private Long baseStat;
    private Long effort;
    private Species stat;

    public Long getBaseStat() { return baseStat; }
    public void setBaseStat(Long value) { this.baseStat = value; }

    public Long getEffort() { return effort; }
    public void setEffort(Long value) { this.effort = value; }

    public Species getStat() { return stat; }
    public void setStat(Species value) { this.stat = value; }
}

class Type {
    private Long slot;
    private Species type;

    public Long getSlot() { return slot; }
    public void setSlot(Long value) { this.slot = value; }

    public Species getType() { return type; }
}