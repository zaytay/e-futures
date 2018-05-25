package com.tay.futures.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * 货币计算的工具类。
 *
 */
public class MoneyUtil {
    /** 货币保留位数，如123.45元 */
    public final static int        MONEY_POS     = 2;

    /** 默认的货币值,0.00 */
    public final static BigDecimal DEFAULT_MONEY = fixMoney(new BigDecimal(0));

    public final static BigDecimal ONE_HUNDRED   = new BigDecimal("100");

    /**
     * 如果<code>money</code>为null,返回默认的货币值,0.00； 否则调整货币，使之保留小数点后两位，并符合四舍五入。
     * 
     * @param money
     * @return
     */
    public static BigDecimal defaultIfNull(BigDecimal money) {
        if (money == null) {
            return DEFAULT_MONEY;
        }

        return fixMoney(money);
    }

    /**
     * 调整货币，使之保留小数点后两位，并符合四舍五入
     * 
     * @param money 要格式化的数字
     * @see #fixMoney(BigDecimal, int)
     * @return BigDecimal 返回BigDecimal对象类型，格式为保留小数点后两位，并四舍五入
     */
    public static BigDecimal fixMoney(BigDecimal money) {
        return fixMoney(money, MONEY_POS);
    }

    /**
     * 调整货币，根据参数设置保留小数点位数，并符合四舍五入
     * 
     * @param money 要格式化的数字
     * @param pos 要保留的小数位数，默认为保留两位
     * @see #fixMoney(BigDecimal, int, int)
     * @return BigDecimal 返回BigDecimal对象类型，格式为保留参数<code>pos</code>定义的小数位数，并四舍五入
     */
    public static BigDecimal fixMoney(BigDecimal money, int pos) {
        return fixMoney(money, pos, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 调整货币，根据参数设置要保留的位数和取舍
     * 
     * @param money 要格式化的数字
     * @param pos 要保留的小数位数
     * @param round 格式化时进行何种舍入，常见有以下方式：<code>ROUND_CEILING</code>，
     *            <code>ROUND_DOWN</code>， <code>ROUND_FLOOR</code>，
     *            <code>ROUND_HALF_DOWN</code>，<code>ROUND_HALF_EVEN</code>，
     *            <code>ROUND_HALF_UP</code>，<code>ROUND_UNNECESSARY</code>，
     *            <code>ROUND_UP</code>， 详细请参看{@link BigDecimal}
     * @see BigDecimal
     * @return BigDecimal 返回BigDecimal对象类型，所有的格式由参数定义
     */
    public static BigDecimal fixMoney(BigDecimal money, int pos, int round) {
        BigDecimal result = null;

        if (money == null) {
            return null;
        }

        result = money.setScale(pos, round);

        return result;
    }

    /**
     * 根据设置的保留小数点位数获得货币金额，默认为保留两位小数和四舍五入
     * 
     * @param money 要格式化的数字，类行为String
     * @see #getMoney(String, int)
     * @return BigDecimal 返回BigDecimal类型，默认保留两位小数点，并四舍五入
     */
    public static BigDecimal getMoney(String money) {
        return getMoney(money, MONEY_POS);
    }

    /**
     * 根据设置的保留小数点位数获得货币金额，默认为四舍五入
     * 
     * @param money 要格式化的数字，类型为String
     * @param pos 要保留的小数位数
     * @see #getMoney(String, int, int)
     * @return BigDecimal 返回BigDecimal类型，格式为保留参数<code>pos</code>定义的小数位数，默认为四舍五入
     */
    public static BigDecimal getMoney(String money, int pos) {
        return getMoney(money, pos, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 根据设置的保留小数点位数和取舍规则获得货币金额
     * 
     * @param money 要格式化的数字，类行为String
     * @param pos 要保留的小数位数
     * @param round 格式化时进行何种舍入，常见有以下方式：<code>ROUND_CEILING</code>，
     *            <code>ROUND_DOWN</code>， <code>ROUND_FLOOR</code>，
     *            <code>ROUND_HALF_DOWN</code>，<code>ROUND_HALF_EVEN</code>，
     *            <code>ROUND_HALF_UP</code>，<code>ROUND_UNNECESSARY</code>，
     *            <code>ROUND_UP</code>， 详细请参看{@link BigDecimal}
     * @see #fixMoney(BigDecimal, int, int)
     * @return BigDecimal 返回BigDecimal类型，格式为保留参数<code>pos</code>定义的小数位数，舍入规则为参数
     *         <code>round</code>定义
     */
    public static BigDecimal getMoney(String money, int pos, int round) {
        if (money != null) {
            try {
                return fixMoney(new BigDecimal(money), pos, round);
            } catch (Exception e) {
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * 根据设置的保留小数点位数获得货币金额，默认为四舍五入
     * 
     * @param money 要格式化的数字
     * @see #getMoneyStr(BigDecimal, int)
     * @return String 返回String类型，格式为默认保留两位小数，并四舍五入
     */
    public static String getMoneyStr(BigDecimal money) {
        return getMoneyStr(money, MONEY_POS);
    }

    /**
     * 根据设置的保留小数点位数获得货币金额，默认为四舍五入
     * 
     * @param money 要格式化的数字
     * @param pos 要保留的小数位数
     * @see #getMoneyStr(BigDecimal, int, int)
     * @return String 返回String类型，格式为保留参数<code>pos</code>定义的小数位数，默认四舍五入
     */
    public static String getMoneyStr(BigDecimal money, int pos) {
        return getMoneyStr(money, pos, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 根据设置的保留小数点位数和取舍规则获得货币金额
     * 
     * @param money 要格式化的数字
     * @param pos 要保留的小数位数
     * @param round 格式化时进行何种舍入，常见有以下方式：<code>ROUND_CEILING</code>，
     *            <code>ROUND_DOWN</code>， <code>ROUND_FLOOR</code>，
     *            <code>ROUND_HALF_DOWN</code>，<code>ROUND_HALF_EVEN</code>，
     *            <code>ROUND_HALF_UP</code>，<code>ROUND_UNNECESSARY</code>，
     *            <code>ROUND_UP</code>， 详细请参看{@link BigDecimal}
     * @see #fixMoney(BigDecimal, int, int)
     * @return String 返回String类型，格式为保留参数<code>pos</code>定义的小数位数，舍入规则为参数
     *         <code>round</code>定义
     */
    public static String getMoneyStr(BigDecimal money, int pos, int round) {
        if (money != null) {
            return fixMoney(money, pos, round).toString();
        } else {
            return null;
        }
    }

    /**
     * 货币加运算，默认返回结果为保留小数点两位和四舍五入
     * 
     * @param money1 第一个加参数
     * @param money2 第二个加参数
     * @see #add(BigDecimal, BigDecimal, int)
     * @return BigDecimal 返回BigDecimal类型，得到参数<code>money1</code>和
     *         <code>money2</code>的和，默认为保留两位小数和四舍五入
     */
    public static BigDecimal add(BigDecimal money1, BigDecimal money2) {
        return add(money1, money2, MONEY_POS);
    }

    /**
     * 货币加运算，默认返回结果为保留小数点两位和四舍五入
     * 
     * @param money1 第一个加参数
     * @param money2 第二个加参数
     * @param pos 要保留的小数位数
     * @see #add(BigDecimal, BigDecimal, int, int)
     * @return BigDecimal 返回BigDecimal类型，得到参数<code>money1</code>和
     *         <code>money2</code>的和， 保留参数<code>pos</code>定义的小数位数，默认为四舍五入
     */
    public static BigDecimal add(BigDecimal money1, BigDecimal money2, int pos) {
        return add(money1, money2, pos, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 货币加运算，默认返回结果为保留小数点两位和四舍五入
     * 
     * @param money1 第一个加参数
     * @param money2 第二个加参数
     * @param pos 要保留的小数位数
     * @param round 格式化时进行何种舍入，常见有以下方式：<code>ROUND_CEILING</code>，
     *            <code>ROUND_DOWN</code>， <code>ROUND_FLOOR</code>，
     *            <code>ROUND_HALF_DOWN</code>，<code>ROUND_HALF_EVEN</code>，
     *            <code>ROUND_HALF_UP</code>，<code>ROUND_UNNECESSARY</code>，
     *            <code>ROUND_UP</code>， 详细请参看{@link BigDecimal}
     * @see BigDecimal#add(BigDecimal)
     * @return BigDecimal 返回BigDecimal类型，得到参数<code>money1</code>和
     *         <code>money2</code>的和， 保留参数<code>pos</code>定义的小数位数，舍入规则由参数
     *         <code>round</code>定义
     */
    public static BigDecimal add(BigDecimal money1, BigDecimal money2, int pos, int round) {
        if (money1 == null) {
            return fixMoney(money2, pos, round);
        }

        if (money2 == null) {
            return fixMoney(money1, pos, round);
        }

        return money1.add(money2).setScale(pos, round);
    }

    /**
     * 货币减运算，默认返回结果为保留小数点两位和四舍五入
     * 
     * @param money1 第一个被减参数
     * @param money2 第二个键参数
     * @see #subtract(BigDecimal, BigDecimal, int)
     * @return BigDecimal 返回BigDecimal类型，默认为保留两位小数和四舍五入
     */
    public static BigDecimal subtract(BigDecimal money1, BigDecimal money2) {
        return subtract(money1, money2, MONEY_POS);
    }

    /**
     * 货币减运算，默认返回结果为保留小数点两位和四舍五入
     * 
     * @param money1 第一个被减参数
     * @param money2 第二个键参数
     * @param pos 结果要保留的小数位数
     * @see #subtract(BigDecimal, BigDecimal, int, int)
     * @return BigDecimal 返回BigDecimal类型，保留参数<code>pos</code>定义的小数位数，默认为四舍五入
     */
    public static BigDecimal subtract(BigDecimal money1, BigDecimal money2, int pos) {
        return subtract(money1, money2, pos, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 货币减运算，默认返回结果为保留小数点两位和四舍五入
     * 
     * @param money1 第一个被减参数
     * @param money2 第二个键参数
     * @param pos 结果要保留的小数位数
     * @param round 格式化时进行何种舍入，常见有以下方式：<code>ROUND_CEILING</code>，
     *            <code>ROUND_DOWN</code>， <code>ROUND_FLOOR</code>，
     *            <code>ROUND_HALF_DOWN</code>，<code>ROUND_HALF_EVEN</code>，
     *            <code>ROUND_HALF_UP</code>，<code>ROUND_UNNECESSARY</code>，
     *            <code>ROUND_UP</code>， 详细请参看{@link BigDecimal}
     * @see BigDecimal#subtract(BigDecimal)
     * @return BigDecimal 返回BigDecimal类型，保留参数<code>pos</code>定义的小数位数，舍入规则由参数
     *         <code>round</code>定义
     */
    public static BigDecimal subtract(BigDecimal money1, BigDecimal money2, int pos, int round) {
        if (money1 == null) {
            return null;
        }

        if (money2 == null) {
            return fixMoney(money1, pos, round);
        }

        return money1.subtract(money2).setScale(pos, round);
    }

    /**
     * 货币乘运算，默认返回结果为保留小数点两位和四舍五入
     * 
     * @param money1 第一个被乘参数
     * @param money2 第二个乘参数
     * @see #multiply(BigDecimal, BigDecimal, int)
     * @return BigDecimal 返回BigDecimal类型，默认为保留两位小数和四舍五入
     */
    public static BigDecimal multiply(BigDecimal money1, BigDecimal money2) {
        return multiply(money1, money2, MONEY_POS);
    }

    /**
     * 货币乘运算，默认返回结果为保留小数点两位和四舍五入
     * 
     * @param money1 第一个被乘参数
     * @param money2 第二个乘参数
     * @param pos 要保留的小数位数
     * @see #multiply(BigDecimal, BigDecimal, int, int)
     * @return BigDecimal 返回BigDecimal类型，保留参数<code>pos</code>定义的小数位数，默认为四舍五入
     */
    public static BigDecimal multiply(BigDecimal money1, BigDecimal money2, int pos) {
        return multiply(money1, money2, pos, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 货币乘运算，默认返回结果为保留小数点两位和四舍五入
     * 
     * @param money1 第一个被乘参数
     * @param money2 第二个乘参数
     * @param pos 要保留的小数位数
     * @param round 格式化时进行何种舍入，常见有以下方式：<code>ROUND_CEILING</code>，
     *            <code>ROUND_DOWN</code>， <code>ROUND_FLOOR</code>，
     *            <code>ROUND_HALF_DOWN</code>，<code>ROUND_HALF_EVEN</code>，
     *            <code>ROUND_HALF_UP</code>，<code>ROUND_UNNECESSARY</code>，
     *            <code>ROUND_UP</code>， 详细请参看{@link BigDecimal}
     * @see BigDecimal#multiply(BigDecimal)
     * @return BigDecimal 返回BigDecimal类型，保留参数<code>pos</code>定义的小数位数，舍入规则由参数
     *         <code>round</code>定义
     */
    public static BigDecimal multiply(BigDecimal money1, BigDecimal money2, int pos, int round) {
        if ((money1 == null) || (money2 == null)) {
            return null;
        }

        return money1.multiply(money2).setScale(pos, round);
    }

    /**
     * 货币除运算，默认返回结果为保留小数点两位和四舍五入
     * 
     * @param money1 第一个被除数
     * @param money2 第二个除数
     * @return BigDecimal 返回BigDecimal类型，默认为保留两位小数和四舍五入
     */
    public static BigDecimal divide(BigDecimal money1, BigDecimal money2) {
        return divide(money1, money2, MONEY_POS);
    }

    /**
     * 货币除运算，默认返回结果为保留小数点两位和四舍五入
     * 
     * @param money1 第一个被除数
     * @param money2 第二个除数
     * @param pos 要保留的小数位数
     * @return BigDecimal 返回BigDecimal类型，保留参数<code>pos</code>定义的小数位数，默认为四舍五入
     */
    public static BigDecimal divide(BigDecimal money1, BigDecimal money2, int pos) {
        return divide(money1, money2, pos, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 货币除运算，默认返回结果为保留小数点两位和四舍五入
     * 
     * @param money1 第一个被除数
     * @param money2 第二个除数
     * @param pos 要保留的小数位数
     * @param round 格式化时进行何种舍入，常见有以下方式：<code>ROUND_CEILING</code>，
     *            <code>ROUND_DOWN</code>， <code>ROUND_FLOOR</code>，
     *            <code>ROUND_HALF_DOWN</code>，<code>ROUND_HALF_EVEN</code>，
     *            <code>ROUND_HALF_UP</code>，<code>ROUND_UNNECESSARY</code>，
     *            <code>ROUND_UP</code>， 详细请参看{@link BigDecimal}
     * @return BigDecimal 返回BigDecimal类型，保留参数<code>pos</code>定义的小数位数，舍入规则由参数
     *         <code>round</code>定义
     */
    public static BigDecimal divide(BigDecimal money1, BigDecimal money2, int pos, int round) {
        if ((money1 == null) || (money2 == null)) {
            return null;
        }

        return money1.divide(money2, pos, round).setScale(pos, round);
    }

    /**
     * 得到格式化的数字，当前默认为中国区域
     * 
     * @param data 要格式化的数字，类型为long
     * @return String 格式化的结果，类型为String，形如：123,543
     */
    public static String formatNumber(long data) {
        NumberFormat nFormat = NumberFormat.getInstance(Locale.CHINA);

        return nFormat.format(data);
    }

    /**
     * 得到格式化的数字，当前默认为中国区域
     * 
     * @param data 要格式化的数字，类型为double
     * @return String 格式化的结果，类型为String，形如：123,543.12
     */
    public static String formatNumber(double data) {
        NumberFormat nFormat = NumberFormat.getInstance(Locale.CHINA);

        return nFormat.format(data);
    }

    /**
     * 得到格式化的数字，当前默认为中国区域
     * 
     * @param data 要格式化的数字，类型为Object
     * @return String 格式化的结果，类型为String，形如：123,543.12
     */
    public static String formatNumber(Object data) {
        NumberFormat nFormat = NumberFormat.getInstance(Locale.CHINA);

        return nFormat.format(data);
    }

    /**
     * 根据格式得到格式化的浮点型数字
     * 
     * @param data 要格式化的数字，类型为long
     * @param type 格式类型，如#,###.00
     * @return String 返回String类型的数值，形式如：23,345,445.34
     */
    public static String formatDecimal(long data, String type) {
        DecimalFormat dFormat = new DecimalFormat(type);

        return dFormat.format(data);
    }

    /**
     * 根据格式得到格式化的浮点型数字
     * 
     * @param data 要格式化的数字，类型为double
     * @param type 格式类型，如#,###.00
     * @return String 返回String类型的数值，形式如：23,345,445.34
     */
    public static String formatDecimal(double data, String type) {
        DecimalFormat dFormat = new DecimalFormat(type);

        return dFormat.format(data);
    }

    /**
     * 根据格式得到格式化的浮点型数字
     * 
     * @param data 要格式化的数字，类型为Object
     * @param type 格式类型，如#,###.00
     * @return String 返回String类型的数值，形式如：23,345,445.34
     */
    public static String formatDecimal(Object data, String type) {
        DecimalFormat dFormat = new DecimalFormat(type);

        return dFormat.format(data);
    }

    public static BigDecimal dollar(BigDecimal money) {
        return divide(money, ONE_HUNDRED);
    }
    
    public static BigDecimal cents(BigDecimal money) {
        return multiply(money, ONE_HUNDRED);
    }
}
