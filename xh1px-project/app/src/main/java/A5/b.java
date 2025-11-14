package A5;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.buzbuz.smartautoclicker.R;
import h5.C0833a;
import o.t1;

/* loaded from: classes.dex */
public final class b implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f301b;

    public /* synthetic */ b(int i4, Object obj) {
        this.f300a = i4;
        this.f301b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        C0833a c0833a;
        int i15;
        int i16 = this.f300a;
        int i17 = 0;
        Object obj = this.f301b;
        switch (i16) {
            case 0:
                f fVar = (f) obj;
                ImageView imageView = fVar.f329q;
                if (imageView.getVisibility() == 0 && (c0833a = fVar.f317I) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    c0833a.setBounds(rect);
                    c0833a.h(imageView, null);
                    return;
                }
                return;
            case 1:
                N5.a aVar = (N5.a) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                aVar.f3785N = iArr[0];
                view.getWindowVisibleDisplayFrame(aVar.f3779G);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                throw null;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f8448s;
                View view2 = searchView.f8416A;
                boolean z8 = true;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f8450u.getPaddingLeft();
                    Rect rect2 = new Rect();
                    boolean z9 = t1.f13385a;
                    if (searchView.getLayoutDirection() != 1) {
                        z8 = false;
                    }
                    if (searchView.f8431Q) {
                        i17 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left);
                    }
                    searchAutoComplete.getDropDownBackground().getPadding(rect2);
                    if (z8) {
                        i15 = -rect2.left;
                    } else {
                        i15 = paddingLeft - (rect2.left + i17);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i15);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect2.left) + rect2.right) + i17) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
