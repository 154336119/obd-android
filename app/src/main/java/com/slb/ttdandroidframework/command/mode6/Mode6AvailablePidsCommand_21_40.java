package com.slb.ttdandroidframework.command.mode6;

import com.github.pires.obd.commands.ObdCommand;
import com.slb.ttdandroidframework.util.ByteUtils;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mabin on 2018-09-07.
 */

public class Mode6AvailablePidsCommand_21_40 extends ObdCommand {

    public Mode6AvailablePidsCommand_21_40() {
        super("06 20");
    }
    @Override
    protected void performCalculations() {

    }
    @Override
    public String getFormattedResult() {
        //计算可用的Test ID
        String availableRawData = getCalculatedResult();
        StringBuffer sb = new StringBuffer();
        for(int start=0; start<availableRawData.length(); start+=2){
            String hex = availableRawData.substring(start,start+2);
            String binary = ByteUtils.hexStr2BinStr(hex);
            sb.append(binary);
        }
        List<String> availablePids = new ArrayList<>();
        for ( int i=0; i<sb.length(); i++){
            if ( sb.charAt(i) == '1' ){
                String pid = Integer.toHexString(i+32).length() == 1 ? "0"+Integer.toHexString(i+32):Integer.toHexString(i+32);
                availablePids.add(pid);
            }
        }
        return StringUtils.join(availablePids.toArray(),",");
    }

    @Override
    public String getCalculatedResult() {
        return rawData.substring(6);
    }

    @Override
    public String getName() {
        return "Mode6AvailablePidsCommand_21_40";
    }
}
