package eu.faircode.xlua.random.randomizers;

import androidx.annotation.NonNull;

import java.util.List;

import eu.faircode.xlua.random.IRandomizer;
import eu.faircode.xlua.random.elements.ISpinnerElement;
import eu.faircode.xlua.utilities.RandomStringGenerator;
import eu.faircode.xlua.utilities.RandomUtil;

public class RandomAdID implements IRandomizer {
    //google.advertisingid
    //Now its "ad.id"
    //84630630-u4ls-k487-f35f-h37afe0pomwq
    //00000000-0000-0000-0000-000000000000

    @Override
    public boolean isSetting(String setting) {
        return setting.equalsIgnoreCase(getSettingName()) || setting.equalsIgnoreCase("unique.google.advertising.id");
    }

    @Override
    public String getSettingName() { return "ad.id"; }

    @Override
    public String getName() {
        return "Advertising ID";
    }

    @Override
    public String getID() {
        return "%ad_id%";
    }

    @Override
    public String generateString() {
        return (RandomStringGenerator.generateRandomHexString(8) +
                "-" +
                RandomStringGenerator.generateRandomHexString(4) +
                "-" +
                RandomStringGenerator.generateRandomNumberString(4) +
                "-" +
                RandomStringGenerator.generateRandomNumberString(4)+
                "-" +
                RandomStringGenerator.generateRandomHexString(12)).toLowerCase();
    }

    @Override
    public int generateInteger() { return 0; }

    @Override
    public List<ISpinnerElement> getOptions() { return null; }

    @NonNull
    @Override
    public String toString() { return getName(); }
}
