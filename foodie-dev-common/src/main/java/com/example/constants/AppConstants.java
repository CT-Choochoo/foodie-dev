package com.example.constants;

/**
 * 存放全部常量 .
 *
 * @author gaobo
 * @group youxuepai.com
 * @date 2020/8/14
 */
public class AppConstants {

  /**
   * 通用的 .
   *
   * @author jiangyong
   * @group youxuepai.com
   * @date 2020/8/14
   */
  public interface Common {

    /**
     * 状态 .
     *
     * @author jiangyong
     * @group youxuepai.com
     * @date 2020/8/14
     */
    interface Status {

      /** 正常 0 */
      Integer NORMAL = 0;
      /** 禁用 1 */
      Integer DISABLED = 1;
    }

    /**
     * 主客观 .
     *
     * @author wanghaoyi
     * @group youxuepai.com
     * @date 2020/12/09
     */
    interface FeatureState {

      /** 客观 objective */
      String OBJECTIVE = "objective";
      /** 主观 subjective */
      String SUBJECTIVE = "subjective";
    }

    /**
     * 删除状态 .
     *
     * @author jiangyong
     * @group youxuepai.com
     * @date 2020/8/14
     */
    interface Deleted {

      /** 正常 */
      Integer NORMAL = 0;
      /** 已删除 * */
      Integer DELETED = 1;
    }

    /**
     * 删除状态 .
     *
     * @author jiangyong
     * @group youxuepai.com
     * @date 2020/8/14
     */
    interface YesOrNo {

      /** 是 */
      public static final int YES = 1;
      /** 不是 * */
      public static final int NO = 0;
    }
  }

  /**
   * 系统相关的 .
   *
   * @author jiangyong
   * @group youxuepai.com
   * @date 2020/9/23
   */
  public interface System {

    /** CONTEXT_PATH */
    String CONTEXT_PATH = "/api/res-struct";
  }

  /**
   * Interface ChapterLevel ... 目录层级
   *
   * @author gaobo
   * @group yxp
   * @date 2020/9/30
   */
  public interface ChapterLevel {

    /** Field LEVEL_1 */
    Integer LEVEL_1 = 1;
    /** Field LEVEL_2 */
    Integer LEVEL_2 = 2;
    /** Field LEVEL_3 */
    Integer LEVEL_3 = 3;
    /** Field LEVEL_4 */
    Integer LEVEL_4 = 4;
    /** Field LEVEL_5 */
    Integer LEVEL_5 = 5;
    /** Field LEVEL_6 */
    Integer LEVEL_6 = 6;
    /** Field LEVEL_7 */
    Integer LEVEL_7 = 7;
    /** Field LEVEL_8 */
    Integer LEVEL_8 = 8;
    /** Field LEVEL_9 */
    Integer LEVEL_9 = 9;
  }

  /**
   * Interface Constants ...
   *
   * @author gaobo
   * @group yxp
   * @date 2020/9/30
   */
  public interface Constants {

    /** Field CONS_STR_0 */
    String CONS_STR_0 = "0";
    /** Field CONS_STR_1 */
    String CONS_STR_1 = "1";
    /** Field CONS_STR_2 */
    String CONS_STR_2 = "2";
    /** Field CONS_STR_3 */
    String CONS_STR_3 = "3";
    /** Field CONS_STR_4 */
    String CONS_STR_4 = "4";
    /** Field CONS_STR_5 */
    String CONS_STR_5 = "5";
    /** Field CONS_STR_6 */
    String CONS_STR_6 = "6";
    /** Field CONS_STR_7 */
    String CONS_STR_7 = "7";
    /** Field CONS_STR_8 */
    String CONS_STR_8 = "8";
    /** Field CONS_STR_9 */
    String CONS_STR_9 = "9";
    /** Field CONS_STR_10 */
    String CONS_STR_10 = "10";

    /** Field CONS_INT_0 */
    Integer CONS_INT_0 = 0;
    /** Field CONS_INT_1 */
    Integer CONS_INT_1 = 1;
    /** Field CONS_INT_2 */
    Integer CONS_INT_2 = 2;
    /** Field CONS_INT_3 */
    Integer CONS_INT_3 = 3;
    /** Field CONS_INT_4 */
    Integer CONS_INT_4 = 4;
    /** Field CONS_INT_5 */
    Integer CONS_INT_5 = 5;
    /** Field CONS_INT_6 */
    Integer CONS_INT_6 = 6;
    /** Field CONS_INT_7 */
    Integer CONS_INT_7 = 7;
    /** Field CONS_INT_8 */
    Integer CONS_INT_8 = 8;
    /** Field CONS_INT_9 */
    Integer CONS_INT_9 = 9;
    /** Field CONS_INT_10 */
    Integer CONS_INT_10 = 10;
  }
}
