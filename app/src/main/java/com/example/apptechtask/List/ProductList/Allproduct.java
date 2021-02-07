
package com.example.apptechtask.List.ProductList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Allproduct {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("sku_id")
    @Expose
    private String skuId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("thumb_ar")
    @Expose
    private String thumbAr;
    @SerializedName("name_ar")
    @Expose
    private String nameAr;
    @SerializedName("des")
    @Expose
    private String des;
    @SerializedName("des_ar")
    @Expose
    private String desAr;
    @SerializedName("act_price")
    @Expose
    private String actPrice;
    @SerializedName("dis_price")
    @Expose
    private String disPrice;
    @SerializedName("cat_name")
    @Expose
    private String catName;
    @SerializedName("cat_id")
    @Expose
    private String catId;
    @SerializedName("subcat_id")
    @Expose
    private String subcatId;
    @SerializedName("subcat_name")
    @Expose
    private String subcatName;
    @SerializedName("microcat_id")
    @Expose
    private String microcatId;
    @SerializedName("microcat_name")
    @Expose
    private String microcatName;
    @SerializedName("brand_id")
    @Expose
    private String brandId;
    @SerializedName("brand_name")
    @Expose
    private Object brandName;
    @SerializedName("seller_id")
    @Expose
    private String sellerId;
    @SerializedName("seller_name")
    @Expose
    private String sellerName;
    @SerializedName("seller_name_ar")
    @Expose
    private Object sellerNameAr;
    @SerializedName("total_review")
    @Expose
    private String totalReview;
    @SerializedName("total_rating")
    @Expose
    private String totalRating;
    @SerializedName("upload_time")
    @Expose
    private String uploadTime;
    @SerializedName("delivery_date")
    @Expose
    private Object deliveryDate;
    @SerializedName("approve_time")
    @Expose
    private Object approveTime;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("delete_status")
    @Expose
    private String deleteStatus;
    @SerializedName("qty")
    @Expose
    private String qty;
    @SerializedName("stock")
    @Expose
    private String stock;
    @SerializedName("hide")
    @Expose
    private String hide;
    @SerializedName("free_product")
    @Expose
    private Object freeProduct;
    @SerializedName("free_product_name")
    @Expose
    private Object freeProductName;
    @SerializedName("approve_by")
    @Expose
    private Object approveBy;
    @SerializedName("coupon_id")
    @Expose
    private Object couponId;
    @SerializedName("coupon_code")
    @Expose
    private Object couponCode;
    @SerializedName("coupon_type")
    @Expose
    private Object couponType;
    @SerializedName("meta_title")
    @Expose
    private String metaTitle;
    @SerializedName("meta_keyword")
    @Expose
    private String metaKeyword;
    @SerializedName("product_dis_stat")
    @Expose
    private Object productDisStat;
    @SerializedName("total_item_sold")
    @Expose
    private String totalItemSold;
    @SerializedName("moq")
    @Expose
    private String moq;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getThumbAr() {
        return thumbAr;
    }

    public void setThumbAr(String thumbAr) {
        this.thumbAr = thumbAr;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getDesAr() {
        return desAr;
    }

    public void setDesAr(String desAr) {
        this.desAr = desAr;
    }

    public String getActPrice() {
        return actPrice;
    }

    public void setActPrice(String actPrice) {
        this.actPrice = actPrice;
    }

    public String getDisPrice() {
        return disPrice;
    }

    public void setDisPrice(String disPrice) {
        this.disPrice = disPrice;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getSubcatId() {
        return subcatId;
    }

    public void setSubcatId(String subcatId) {
        this.subcatId = subcatId;
    }

    public String getSubcatName() {
        return subcatName;
    }

    public void setSubcatName(String subcatName) {
        this.subcatName = subcatName;
    }

    public String getMicrocatId() {
        return microcatId;
    }

    public void setMicrocatId(String microcatId) {
        this.microcatId = microcatId;
    }

    public String getMicrocatName() {
        return microcatName;
    }

    public void setMicrocatName(String microcatName) {
        this.microcatName = microcatName;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public Object getBrandName() {
        return brandName;
    }

    public void setBrandName(Object brandName) {
        this.brandName = brandName;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Object getSellerNameAr() {
        return sellerNameAr;
    }

    public void setSellerNameAr(Object sellerNameAr) {
        this.sellerNameAr = sellerNameAr;
    }

    public String getTotalReview() {
        return totalReview;
    }

    public void setTotalReview(String totalReview) {
        this.totalReview = totalReview;
    }

    public String getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(String totalRating) {
        this.totalRating = totalRating;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Object getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Object deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Object getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Object approveTime) {
        this.approveTime = approveTime;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getHide() {
        return hide;
    }

    public void setHide(String hide) {
        this.hide = hide;
    }

    public Object getFreeProduct() {
        return freeProduct;
    }

    public void setFreeProduct(Object freeProduct) {
        this.freeProduct = freeProduct;
    }

    public Object getFreeProductName() {
        return freeProductName;
    }

    public void setFreeProductName(Object freeProductName) {
        this.freeProductName = freeProductName;
    }

    public Object getApproveBy() {
        return approveBy;
    }

    public void setApproveBy(Object approveBy) {
        this.approveBy = approveBy;
    }

    public Object getCouponId() {
        return couponId;
    }

    public void setCouponId(Object couponId) {
        this.couponId = couponId;
    }

    public Object getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(Object couponCode) {
        this.couponCode = couponCode;
    }

    public Object getCouponType() {
        return couponType;
    }

    public void setCouponType(Object couponType) {
        this.couponType = couponType;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaKeyword() {
        return metaKeyword;
    }

    public void setMetaKeyword(String metaKeyword) {
        this.metaKeyword = metaKeyword;
    }

    public Object getProductDisStat() {
        return productDisStat;
    }

    public void setProductDisStat(Object productDisStat) {
        this.productDisStat = productDisStat;
    }

    public String getTotalItemSold() {
        return totalItemSold;
    }

    public void setTotalItemSold(String totalItemSold) {
        this.totalItemSold = totalItemSold;
    }

    public String getMoq() {
        return moq;
    }

    public void setMoq(String moq) {
        this.moq = moq;
    }

}
