package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.wall.responses.GetExtendedResponse;
import com.vk.api.sdk.queries.Field;

import java.util.Collections;
import java.util.List;

/**
 * Query for Wall.get method
 */
public class WallGetQueryWithExtended extends AbstractQueryBuilder<WallGetQueryWithExtended, GetExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public WallGetQueryWithExtended(VkApiClient client, Actor actor) {
        super(client, "wall.get", GetExtendedResponse.class);
        accessToken(actor.getAccessToken());
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public WallGetQueryWithExtended(VkApiClient client) {
        super(client, "wall.get", GetExtendedResponse.class);
        extended(true);
    }

    /**
     * ID of the user or community that owns the wall. By default, current user ID. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetQueryWithExtended ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * User or community short address.
     *
     * @param value value of "domain" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetQueryWithExtended domain(String value) {
        return unsafeParam("domain", value);
    }

    /**
     * Offset needed to return a specific subset of posts.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of posts to return (maximum 100).
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Filter to apply:
     * ''owner'' - posts by the wall owner
     * ''others'' - posts by someone else
     * ''all'' - posts by the wall owner and others (default)
     * ''postponed'' - timed posts (only available for calls with an "access_token")
     * ''suggests'' - suggested posts on a community wall
     *
     * @param value value of "filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetQueryWithExtended filter(String value) {
        return unsafeParam("filter", value);
    }

    /**
     * ''1'' - to return "wall", "profiles", and "groups" fields
     * ''0'' - to return no additional fields (default)
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallGetQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetQueryWithExtended fields(Field... value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected WallGetQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}