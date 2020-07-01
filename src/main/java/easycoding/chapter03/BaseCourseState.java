package easycoding.chapter03;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-04-27 16:14
 */
public abstract class BaseCourseState {
    public static final int NEW_COURSE=1;
    public static final int UNAUTHED_COURSE=2;
    public static final int PASSED_COURSE=3;
    public static final int NOT_PASSED_COURSE=4;
    public static final int DELETED_COURSE=5;

    public void getPackageCourse(Long packageId,Long userId){
        if (packageId==CourseTypeEnum.OFFLINE_COURSE.getSeq()){
            System.out.println("线下课程，无法在线管");
        }
    }
}
