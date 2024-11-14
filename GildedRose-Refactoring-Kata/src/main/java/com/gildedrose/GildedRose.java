package com.gildedrose;

class GildedRose {
    Item[] items;
    static final String AGED = "Aged Brie"
    static final String BACKSTATGE = "Backstage passes to a TAFKAL80ETC concert"
    static final String SULFURAS = "Sulfuras, Hand of Ragnaros"

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(AGED)
                    && !items[i].name.equals(BACKSTATGE)) {
                if (items[i].quality > 0 && !items[i].name.equals(SULFURAS)) {
                        items[i].quality = items[i].quality - 1;
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11 && items[i].quality < 50) {

                                items[i].quality = items[i].quality + 1;

                        }

                        if (items[i].sellIn < 6 && items[i].quality < 50) {

                                items[i].quality = items[i].quality + 1;

                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0 && !items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                            items[i].quality = items[i].quality - 1;

                        }
                    } else {
                        items[i].quality = 0;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}
