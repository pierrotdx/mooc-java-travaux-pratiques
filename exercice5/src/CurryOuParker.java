public class CurryOuParker {
    public static void main(String[] args) {
        float currySizeInFt = 6.3f;
        float parkerSizeInCm = 188f;
        float cmsInSingleFt = 30.48f;

        float currySizeInCm = currySizeInFt * cmsInSingleFt;
        boolean isCurryTaller = currySizeInCm > parkerSizeInCm;
        System.out.println(isCurryTaller);
    }

}