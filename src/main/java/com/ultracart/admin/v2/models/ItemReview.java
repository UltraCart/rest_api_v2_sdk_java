/*
 * UltraCart Rest API V2
 * UltraCart REST API Version 2
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@ultracart.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ultracart.admin.v2.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ItemReview
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ItemReview {
  @SerializedName("customer_profile_oid")
  private Integer customerProfileOid = null;

  @SerializedName("featured")
  private Boolean featured = null;

  @SerializedName("helperful_no_votes")
  private Integer helperfulNoVotes = null;

  @SerializedName("helpful_yes_votes")
  private Integer helpfulYesVotes = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("overall")
  private BigDecimal overall = null;

  @SerializedName("rating_name1")
  private String ratingName1 = null;

  @SerializedName("rating_name10")
  private String ratingName10 = null;

  @SerializedName("rating_name2")
  private String ratingName2 = null;

  @SerializedName("rating_name3")
  private String ratingName3 = null;

  @SerializedName("rating_name4")
  private String ratingName4 = null;

  @SerializedName("rating_name5")
  private String ratingName5 = null;

  @SerializedName("rating_name6")
  private String ratingName6 = null;

  @SerializedName("rating_name7")
  private String ratingName7 = null;

  @SerializedName("rating_name8")
  private String ratingName8 = null;

  @SerializedName("rating_name9")
  private String ratingName9 = null;

  @SerializedName("rating_score1")
  private BigDecimal ratingScore1 = null;

  @SerializedName("rating_score10")
  private BigDecimal ratingScore10 = null;

  @SerializedName("rating_score2")
  private BigDecimal ratingScore2 = null;

  @SerializedName("rating_score3")
  private BigDecimal ratingScore3 = null;

  @SerializedName("rating_score4")
  private BigDecimal ratingScore4 = null;

  @SerializedName("rating_score5")
  private BigDecimal ratingScore5 = null;

  @SerializedName("rating_score6")
  private BigDecimal ratingScore6 = null;

  @SerializedName("rating_score7")
  private BigDecimal ratingScore7 = null;

  @SerializedName("rating_score8")
  private BigDecimal ratingScore8 = null;

  @SerializedName("rating_score9")
  private BigDecimal ratingScore9 = null;

  @SerializedName("recommend_store_to_friend")
  private Integer recommendStoreToFriend = null;

  @SerializedName("recommend_to_friend")
  private Boolean recommendToFriend = null;

  @SerializedName("review")
  private String review = null;

  @SerializedName("review_oid")
  private Integer reviewOid = null;

  @SerializedName("reviewed_nickname")
  private String reviewedNickname = null;

  @SerializedName("reviewer_email")
  private String reviewerEmail = null;

  @SerializedName("reviewer_location")
  private String reviewerLocation = null;

  /**
   * Status of the review
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    APPROVED("approved"),
    
    UNAPPROVED("unapproved"),
    
    REJECTED("rejected"),
    
    MULTIMEDIA_PROCESSING("multimedia processing");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("store_feedback")
  private String storeFeedback = null;

  @SerializedName("submitted_dts")
  private String submittedDts = null;

  @SerializedName("title")
  private String title = null;

  public ItemReview customerProfileOid(Integer customerProfileOid) {
    this.customerProfileOid = customerProfileOid;
    return this;
  }

   /**
   * Customer profile object identifier
   * @return customerProfileOid
  **/
  @ApiModelProperty(value = "Customer profile object identifier")
  public Integer getCustomerProfileOid() {
    return customerProfileOid;
  }

  public void setCustomerProfileOid(Integer customerProfileOid) {
    this.customerProfileOid = customerProfileOid;
  }

  public ItemReview featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  @ApiModelProperty(value = "")
  public Boolean isFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public ItemReview helperfulNoVotes(Integer helperfulNoVotes) {
    this.helperfulNoVotes = helperfulNoVotes;
    return this;
  }

   /**
   * Get helperfulNoVotes
   * @return helperfulNoVotes
  **/
  @ApiModelProperty(value = "")
  public Integer getHelperfulNoVotes() {
    return helperfulNoVotes;
  }

  public void setHelperfulNoVotes(Integer helperfulNoVotes) {
    this.helperfulNoVotes = helperfulNoVotes;
  }

  public ItemReview helpfulYesVotes(Integer helpfulYesVotes) {
    this.helpfulYesVotes = helpfulYesVotes;
    return this;
  }

   /**
   * Get helpfulYesVotes
   * @return helpfulYesVotes
  **/
  @ApiModelProperty(value = "")
  public Integer getHelpfulYesVotes() {
    return helpfulYesVotes;
  }

  public void setHelpfulYesVotes(Integer helpfulYesVotes) {
    this.helpfulYesVotes = helpfulYesVotes;
  }

  public ItemReview orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public ItemReview overall(BigDecimal overall) {
    this.overall = overall;
    return this;
  }

   /**
   * Get overall
   * @return overall
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOverall() {
    return overall;
  }

  public void setOverall(BigDecimal overall) {
    this.overall = overall;
  }

  public ItemReview ratingName1(String ratingName1) {
    this.ratingName1 = ratingName1;
    return this;
  }

   /**
   * Rating Name 1
   * @return ratingName1
  **/
  @ApiModelProperty(value = "Rating Name 1")
  public String getRatingName1() {
    return ratingName1;
  }

  public void setRatingName1(String ratingName1) {
    this.ratingName1 = ratingName1;
  }

  public ItemReview ratingName10(String ratingName10) {
    this.ratingName10 = ratingName10;
    return this;
  }

   /**
   * Rating Name 10
   * @return ratingName10
  **/
  @ApiModelProperty(value = "Rating Name 10")
  public String getRatingName10() {
    return ratingName10;
  }

  public void setRatingName10(String ratingName10) {
    this.ratingName10 = ratingName10;
  }

  public ItemReview ratingName2(String ratingName2) {
    this.ratingName2 = ratingName2;
    return this;
  }

   /**
   * Rating Name 2
   * @return ratingName2
  **/
  @ApiModelProperty(value = "Rating Name 2")
  public String getRatingName2() {
    return ratingName2;
  }

  public void setRatingName2(String ratingName2) {
    this.ratingName2 = ratingName2;
  }

  public ItemReview ratingName3(String ratingName3) {
    this.ratingName3 = ratingName3;
    return this;
  }

   /**
   * Rating Name 3
   * @return ratingName3
  **/
  @ApiModelProperty(value = "Rating Name 3")
  public String getRatingName3() {
    return ratingName3;
  }

  public void setRatingName3(String ratingName3) {
    this.ratingName3 = ratingName3;
  }

  public ItemReview ratingName4(String ratingName4) {
    this.ratingName4 = ratingName4;
    return this;
  }

   /**
   * Rating Name 4
   * @return ratingName4
  **/
  @ApiModelProperty(value = "Rating Name 4")
  public String getRatingName4() {
    return ratingName4;
  }

  public void setRatingName4(String ratingName4) {
    this.ratingName4 = ratingName4;
  }

  public ItemReview ratingName5(String ratingName5) {
    this.ratingName5 = ratingName5;
    return this;
  }

   /**
   * Rating Name 5
   * @return ratingName5
  **/
  @ApiModelProperty(value = "Rating Name 5")
  public String getRatingName5() {
    return ratingName5;
  }

  public void setRatingName5(String ratingName5) {
    this.ratingName5 = ratingName5;
  }

  public ItemReview ratingName6(String ratingName6) {
    this.ratingName6 = ratingName6;
    return this;
  }

   /**
   * Rating Name 6
   * @return ratingName6
  **/
  @ApiModelProperty(value = "Rating Name 6")
  public String getRatingName6() {
    return ratingName6;
  }

  public void setRatingName6(String ratingName6) {
    this.ratingName6 = ratingName6;
  }

  public ItemReview ratingName7(String ratingName7) {
    this.ratingName7 = ratingName7;
    return this;
  }

   /**
   * Rating Name 7
   * @return ratingName7
  **/
  @ApiModelProperty(value = "Rating Name 7")
  public String getRatingName7() {
    return ratingName7;
  }

  public void setRatingName7(String ratingName7) {
    this.ratingName7 = ratingName7;
  }

  public ItemReview ratingName8(String ratingName8) {
    this.ratingName8 = ratingName8;
    return this;
  }

   /**
   * Rating Name 8
   * @return ratingName8
  **/
  @ApiModelProperty(value = "Rating Name 8")
  public String getRatingName8() {
    return ratingName8;
  }

  public void setRatingName8(String ratingName8) {
    this.ratingName8 = ratingName8;
  }

  public ItemReview ratingName9(String ratingName9) {
    this.ratingName9 = ratingName9;
    return this;
  }

   /**
   * Rating Name 9
   * @return ratingName9
  **/
  @ApiModelProperty(value = "Rating Name 9")
  public String getRatingName9() {
    return ratingName9;
  }

  public void setRatingName9(String ratingName9) {
    this.ratingName9 = ratingName9;
  }

  public ItemReview ratingScore1(BigDecimal ratingScore1) {
    this.ratingScore1 = ratingScore1;
    return this;
  }

   /**
   * Get ratingScore1
   * @return ratingScore1
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRatingScore1() {
    return ratingScore1;
  }

  public void setRatingScore1(BigDecimal ratingScore1) {
    this.ratingScore1 = ratingScore1;
  }

  public ItemReview ratingScore10(BigDecimal ratingScore10) {
    this.ratingScore10 = ratingScore10;
    return this;
  }

   /**
   * Get ratingScore10
   * @return ratingScore10
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRatingScore10() {
    return ratingScore10;
  }

  public void setRatingScore10(BigDecimal ratingScore10) {
    this.ratingScore10 = ratingScore10;
  }

  public ItemReview ratingScore2(BigDecimal ratingScore2) {
    this.ratingScore2 = ratingScore2;
    return this;
  }

   /**
   * Get ratingScore2
   * @return ratingScore2
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRatingScore2() {
    return ratingScore2;
  }

  public void setRatingScore2(BigDecimal ratingScore2) {
    this.ratingScore2 = ratingScore2;
  }

  public ItemReview ratingScore3(BigDecimal ratingScore3) {
    this.ratingScore3 = ratingScore3;
    return this;
  }

   /**
   * Get ratingScore3
   * @return ratingScore3
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRatingScore3() {
    return ratingScore3;
  }

  public void setRatingScore3(BigDecimal ratingScore3) {
    this.ratingScore3 = ratingScore3;
  }

  public ItemReview ratingScore4(BigDecimal ratingScore4) {
    this.ratingScore4 = ratingScore4;
    return this;
  }

   /**
   * Get ratingScore4
   * @return ratingScore4
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRatingScore4() {
    return ratingScore4;
  }

  public void setRatingScore4(BigDecimal ratingScore4) {
    this.ratingScore4 = ratingScore4;
  }

  public ItemReview ratingScore5(BigDecimal ratingScore5) {
    this.ratingScore5 = ratingScore5;
    return this;
  }

   /**
   * Get ratingScore5
   * @return ratingScore5
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRatingScore5() {
    return ratingScore5;
  }

  public void setRatingScore5(BigDecimal ratingScore5) {
    this.ratingScore5 = ratingScore5;
  }

  public ItemReview ratingScore6(BigDecimal ratingScore6) {
    this.ratingScore6 = ratingScore6;
    return this;
  }

   /**
   * Get ratingScore6
   * @return ratingScore6
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRatingScore6() {
    return ratingScore6;
  }

  public void setRatingScore6(BigDecimal ratingScore6) {
    this.ratingScore6 = ratingScore6;
  }

  public ItemReview ratingScore7(BigDecimal ratingScore7) {
    this.ratingScore7 = ratingScore7;
    return this;
  }

   /**
   * Get ratingScore7
   * @return ratingScore7
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRatingScore7() {
    return ratingScore7;
  }

  public void setRatingScore7(BigDecimal ratingScore7) {
    this.ratingScore7 = ratingScore7;
  }

  public ItemReview ratingScore8(BigDecimal ratingScore8) {
    this.ratingScore8 = ratingScore8;
    return this;
  }

   /**
   * Get ratingScore8
   * @return ratingScore8
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRatingScore8() {
    return ratingScore8;
  }

  public void setRatingScore8(BigDecimal ratingScore8) {
    this.ratingScore8 = ratingScore8;
  }

  public ItemReview ratingScore9(BigDecimal ratingScore9) {
    this.ratingScore9 = ratingScore9;
    return this;
  }

   /**
   * Get ratingScore9
   * @return ratingScore9
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRatingScore9() {
    return ratingScore9;
  }

  public void setRatingScore9(BigDecimal ratingScore9) {
    this.ratingScore9 = ratingScore9;
  }

  public ItemReview recommendStoreToFriend(Integer recommendStoreToFriend) {
    this.recommendStoreToFriend = recommendStoreToFriend;
    return this;
  }

   /**
   * Get recommendStoreToFriend
   * @return recommendStoreToFriend
  **/
  @ApiModelProperty(value = "")
  public Integer getRecommendStoreToFriend() {
    return recommendStoreToFriend;
  }

  public void setRecommendStoreToFriend(Integer recommendStoreToFriend) {
    this.recommendStoreToFriend = recommendStoreToFriend;
  }

  public ItemReview recommendToFriend(Boolean recommendToFriend) {
    this.recommendToFriend = recommendToFriend;
    return this;
  }

   /**
   * Get recommendToFriend
   * @return recommendToFriend
  **/
  @ApiModelProperty(value = "")
  public Boolean isRecommendToFriend() {
    return recommendToFriend;
  }

  public void setRecommendToFriend(Boolean recommendToFriend) {
    this.recommendToFriend = recommendToFriend;
  }

  public ItemReview review(String review) {
    this.review = review;
    return this;
  }

   /**
   * Review
   * @return review
  **/
  @ApiModelProperty(value = "Review")
  public String getReview() {
    return review;
  }

  public void setReview(String review) {
    this.review = review;
  }

  public ItemReview reviewOid(Integer reviewOid) {
    this.reviewOid = reviewOid;
    return this;
  }

   /**
   * Get reviewOid
   * @return reviewOid
  **/
  @ApiModelProperty(value = "")
  public Integer getReviewOid() {
    return reviewOid;
  }

  public void setReviewOid(Integer reviewOid) {
    this.reviewOid = reviewOid;
  }

  public ItemReview reviewedNickname(String reviewedNickname) {
    this.reviewedNickname = reviewedNickname;
    return this;
  }

   /**
   * Nickname
   * @return reviewedNickname
  **/
  @ApiModelProperty(value = "Nickname")
  public String getReviewedNickname() {
    return reviewedNickname;
  }

  public void setReviewedNickname(String reviewedNickname) {
    this.reviewedNickname = reviewedNickname;
  }

  public ItemReview reviewerEmail(String reviewerEmail) {
    this.reviewerEmail = reviewerEmail;
    return this;
  }

   /**
   * Reviewer Email
   * @return reviewerEmail
  **/
  @ApiModelProperty(value = "Reviewer Email")
  public String getReviewerEmail() {
    return reviewerEmail;
  }

  public void setReviewerEmail(String reviewerEmail) {
    this.reviewerEmail = reviewerEmail;
  }

  public ItemReview reviewerLocation(String reviewerLocation) {
    this.reviewerLocation = reviewerLocation;
    return this;
  }

   /**
   * Location
   * @return reviewerLocation
  **/
  @ApiModelProperty(value = "Location")
  public String getReviewerLocation() {
    return reviewerLocation;
  }

  public void setReviewerLocation(String reviewerLocation) {
    this.reviewerLocation = reviewerLocation;
  }

  public ItemReview status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the review
   * @return status
  **/
  @ApiModelProperty(value = "Status of the review")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ItemReview storeFeedback(String storeFeedback) {
    this.storeFeedback = storeFeedback;
    return this;
  }

   /**
   * Store Feedback
   * @return storeFeedback
  **/
  @ApiModelProperty(value = "Store Feedback")
  public String getStoreFeedback() {
    return storeFeedback;
  }

  public void setStoreFeedback(String storeFeedback) {
    this.storeFeedback = storeFeedback;
  }

  public ItemReview submittedDts(String submittedDts) {
    this.submittedDts = submittedDts;
    return this;
  }

   /**
   * Date/time of review submission
   * @return submittedDts
  **/
  @ApiModelProperty(value = "Date/time of review submission")
  public String getSubmittedDts() {
    return submittedDts;
  }

  public void setSubmittedDts(String submittedDts) {
    this.submittedDts = submittedDts;
  }

  public ItemReview title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title
   * @return title
  **/
  @ApiModelProperty(value = "Title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemReview itemReview = (ItemReview) o;
    return Objects.equals(this.customerProfileOid, itemReview.customerProfileOid) &&
        Objects.equals(this.featured, itemReview.featured) &&
        Objects.equals(this.helperfulNoVotes, itemReview.helperfulNoVotes) &&
        Objects.equals(this.helpfulYesVotes, itemReview.helpfulYesVotes) &&
        Objects.equals(this.orderId, itemReview.orderId) &&
        Objects.equals(this.overall, itemReview.overall) &&
        Objects.equals(this.ratingName1, itemReview.ratingName1) &&
        Objects.equals(this.ratingName10, itemReview.ratingName10) &&
        Objects.equals(this.ratingName2, itemReview.ratingName2) &&
        Objects.equals(this.ratingName3, itemReview.ratingName3) &&
        Objects.equals(this.ratingName4, itemReview.ratingName4) &&
        Objects.equals(this.ratingName5, itemReview.ratingName5) &&
        Objects.equals(this.ratingName6, itemReview.ratingName6) &&
        Objects.equals(this.ratingName7, itemReview.ratingName7) &&
        Objects.equals(this.ratingName8, itemReview.ratingName8) &&
        Objects.equals(this.ratingName9, itemReview.ratingName9) &&
        Objects.equals(this.ratingScore1, itemReview.ratingScore1) &&
        Objects.equals(this.ratingScore10, itemReview.ratingScore10) &&
        Objects.equals(this.ratingScore2, itemReview.ratingScore2) &&
        Objects.equals(this.ratingScore3, itemReview.ratingScore3) &&
        Objects.equals(this.ratingScore4, itemReview.ratingScore4) &&
        Objects.equals(this.ratingScore5, itemReview.ratingScore5) &&
        Objects.equals(this.ratingScore6, itemReview.ratingScore6) &&
        Objects.equals(this.ratingScore7, itemReview.ratingScore7) &&
        Objects.equals(this.ratingScore8, itemReview.ratingScore8) &&
        Objects.equals(this.ratingScore9, itemReview.ratingScore9) &&
        Objects.equals(this.recommendStoreToFriend, itemReview.recommendStoreToFriend) &&
        Objects.equals(this.recommendToFriend, itemReview.recommendToFriend) &&
        Objects.equals(this.review, itemReview.review) &&
        Objects.equals(this.reviewOid, itemReview.reviewOid) &&
        Objects.equals(this.reviewedNickname, itemReview.reviewedNickname) &&
        Objects.equals(this.reviewerEmail, itemReview.reviewerEmail) &&
        Objects.equals(this.reviewerLocation, itemReview.reviewerLocation) &&
        Objects.equals(this.status, itemReview.status) &&
        Objects.equals(this.storeFeedback, itemReview.storeFeedback) &&
        Objects.equals(this.submittedDts, itemReview.submittedDts) &&
        Objects.equals(this.title, itemReview.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerProfileOid, featured, helperfulNoVotes, helpfulYesVotes, orderId, overall, ratingName1, ratingName10, ratingName2, ratingName3, ratingName4, ratingName5, ratingName6, ratingName7, ratingName8, ratingName9, ratingScore1, ratingScore10, ratingScore2, ratingScore3, ratingScore4, ratingScore5, ratingScore6, ratingScore7, ratingScore8, ratingScore9, recommendStoreToFriend, recommendToFriend, review, reviewOid, reviewedNickname, reviewerEmail, reviewerLocation, status, storeFeedback, submittedDts, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemReview {\n");
    
    sb.append("    customerProfileOid: ").append(toIndentedString(customerProfileOid)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    helperfulNoVotes: ").append(toIndentedString(helperfulNoVotes)).append("\n");
    sb.append("    helpfulYesVotes: ").append(toIndentedString(helpfulYesVotes)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    ratingName1: ").append(toIndentedString(ratingName1)).append("\n");
    sb.append("    ratingName10: ").append(toIndentedString(ratingName10)).append("\n");
    sb.append("    ratingName2: ").append(toIndentedString(ratingName2)).append("\n");
    sb.append("    ratingName3: ").append(toIndentedString(ratingName3)).append("\n");
    sb.append("    ratingName4: ").append(toIndentedString(ratingName4)).append("\n");
    sb.append("    ratingName5: ").append(toIndentedString(ratingName5)).append("\n");
    sb.append("    ratingName6: ").append(toIndentedString(ratingName6)).append("\n");
    sb.append("    ratingName7: ").append(toIndentedString(ratingName7)).append("\n");
    sb.append("    ratingName8: ").append(toIndentedString(ratingName8)).append("\n");
    sb.append("    ratingName9: ").append(toIndentedString(ratingName9)).append("\n");
    sb.append("    ratingScore1: ").append(toIndentedString(ratingScore1)).append("\n");
    sb.append("    ratingScore10: ").append(toIndentedString(ratingScore10)).append("\n");
    sb.append("    ratingScore2: ").append(toIndentedString(ratingScore2)).append("\n");
    sb.append("    ratingScore3: ").append(toIndentedString(ratingScore3)).append("\n");
    sb.append("    ratingScore4: ").append(toIndentedString(ratingScore4)).append("\n");
    sb.append("    ratingScore5: ").append(toIndentedString(ratingScore5)).append("\n");
    sb.append("    ratingScore6: ").append(toIndentedString(ratingScore6)).append("\n");
    sb.append("    ratingScore7: ").append(toIndentedString(ratingScore7)).append("\n");
    sb.append("    ratingScore8: ").append(toIndentedString(ratingScore8)).append("\n");
    sb.append("    ratingScore9: ").append(toIndentedString(ratingScore9)).append("\n");
    sb.append("    recommendStoreToFriend: ").append(toIndentedString(recommendStoreToFriend)).append("\n");
    sb.append("    recommendToFriend: ").append(toIndentedString(recommendToFriend)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    reviewOid: ").append(toIndentedString(reviewOid)).append("\n");
    sb.append("    reviewedNickname: ").append(toIndentedString(reviewedNickname)).append("\n");
    sb.append("    reviewerEmail: ").append(toIndentedString(reviewerEmail)).append("\n");
    sb.append("    reviewerLocation: ").append(toIndentedString(reviewerLocation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storeFeedback: ").append(toIndentedString(storeFeedback)).append("\n");
    sb.append("    submittedDts: ").append(toIndentedString(submittedDts)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

