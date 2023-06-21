package com.bappy

class Item {
    String productName
    String productCategory
    String productBarcode

    static constraints = {
        productBarcode productBarcode: true
    }
}
