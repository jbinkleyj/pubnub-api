/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pubnub.api;

/**
 *
 * @author Pubnub
 */


interface ResponseHandler {
    public abstract void handleResponse(String response);
    public abstract void handleError(String response);
}