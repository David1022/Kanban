package com.davidmendano.kanban.Repos;

/**
 * This interface will be implemented by models in order to return the associated repo name and author
 */

public interface ItemComponentModelInterface {

    String getRepoName();

    String getRepoAuthor();
}
