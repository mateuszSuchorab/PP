package com.project.pp.Service;

import org.springframework.stereotype.Service;

@Service
public class DateService {



//    // ~800,000 op/s
//    public void dateParsingWithFormat(DateState state) throws ParseException {
//        Date date = state.formatter.parse("20-09-2017 00:00:00");
//        date = new Date(date.getTime() + 24 * state.oneHour);
//
//        state.formatter.format(date);
//    }
//
//    // ~3,200,000 op/s
//    public void dateLongWithFormat(DateState state) {
//        long newTime = state.time + 24 * state.oneHour;
//
//        state.formatter.format(new Date(newTime));
//    }
//
//    // ~400,000,000 op/s
//    public long dateLong(DateState state) {
//        long newTime = state.time + 24 * state.oneHour;
//
//        return newTime;
//    }


}
