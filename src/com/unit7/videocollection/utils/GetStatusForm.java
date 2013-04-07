/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils;

/**
 *
 * @author unit7
 */
public interface GetStatusForm {
    int getStatus();
    
    static final int OK = 0;
    static final int CANCEL = 1;
    static final int WAITING = -1;
}
