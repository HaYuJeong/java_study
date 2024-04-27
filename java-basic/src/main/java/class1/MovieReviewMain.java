package class1;

/**
 * packageName : class1
 * fileName : ClassStart3
 * author : hayj6
 * date : 2024-04-27(027)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-27(027)         hayj6          최초 생성
 */
public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();    // 객체 생성
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        MovieReview movieReview2 = new MovieReview();    // 객체 생성
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        MovieReview[] movieReviews = new MovieReview[]{movieReview1, movieReview2};

        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println("영화 제목 : " + movieReviews[i].title + " 리뷰 : " + movieReviews[i].review);
        }
    }
}
