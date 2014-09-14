package demo

import twitter4j.Status
import twitter4j.StatusAdapter

class MyStatusListener extends StatusAdapter{
    @Override
    void onStatus(Status status) {
        println status.text
    }
}
