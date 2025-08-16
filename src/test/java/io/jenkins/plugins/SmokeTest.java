package io.jenkins.plugins;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.junit.jupiter.WithJenkins;

@WithJenkins
class SmokeTest {
    @Test
    void smokeTest(JenkinsRule jenkinsRule) throws Exception {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add("foo");
        jsonArray.add("bar");
        assertEquals("[\"foo\", \"bar\"]", jsonArray.asList().toString()); // Added on 2.10
        JsonObject jsonObject = new JsonObject();
        assertTrue(jsonObject.isEmpty()); // Added on 2.10.1
    }
}
