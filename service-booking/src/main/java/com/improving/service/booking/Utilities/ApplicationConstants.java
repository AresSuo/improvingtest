package com.improving.service.booking.Utilities;

import org.apache.commons.lang3.StringUtils;

public class ApplicationConstants {
	
	public static final String URL_RESERVATIONS = "/reservations";

	public static final String REPLACE_T_CHARACTER = "T";

	public static final String REPLACE_T_SPACE = StringUtils.SPACE;

	public class EntityConstants {

        public static final String BOOKING_TABLE = "PRODUCTO";

        public static final String BOOKING_NAME_COLUMN = "NAME";

        public static final String BOOKING_DATE_TIME_COLUMN = "LOCAL_DATE_TIME";

    }

}
