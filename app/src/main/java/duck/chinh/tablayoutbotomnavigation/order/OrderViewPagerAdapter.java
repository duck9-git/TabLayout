package duck.chinh.tablayoutbotomnavigation.order;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import duck.chinh.tablayoutbotomnavigation.fragment.AccountFragment;
import duck.chinh.tablayoutbotomnavigation.fragment.NewsFragment;
import duck.chinh.tablayoutbotomnavigation.fragment.OrderFragment;

public class OrderViewPagerAdapter extends FragmentStatePagerAdapter {
    public OrderViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:

                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            case 2:
                return new Tab3Fragment();
            default:
                return new Tab1Fragment();

        }

    }

    @Override
    public int getCount() {
        return 3;

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Cao";
            case 1:
                return "Duc";
            case 2:
                return "Chinh";
            default:
                return "Cao";

        }
    }
}
