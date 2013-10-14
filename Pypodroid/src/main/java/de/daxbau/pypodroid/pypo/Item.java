package de.daxbau.pypodroid.pypo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Item {

    /**
     * An array of sample (dummy) items.
     */
    public static List<PypoItem> ITEMS = new ArrayList<PypoItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, PypoItem> ITEM_MAP = new HashMap<String, PypoItem>();

    static {
        // Add 3 sample items.
        addItem(new PypoItem("1", "Example", "http://www.example.com",
                "example.com", "Item 1"));
        addItem(new PypoItem("2", "Google", "http://www.google.com",
                "google.com", "Item 2"));
        addItem(new PypoItem("3", "Pypo", "http://www.daxbau.net/pypo",
                "daxbau.net", "Item 3"));
    }

    private static void addItem(PypoItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class PypoItem {
        public String id;
        public String content;
        public String url;
        public String title;
        public String domain;

        public PypoItem(String id, String title, String url, String domain, String content) {
            this.id = id;
            this.title = title;
            this.url = url;
            this.domain = domain;
            this.content = content;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
