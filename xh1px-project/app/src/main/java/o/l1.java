package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.buzbuz.smartautoclicker.R;
import h.AbstractC0805a;

/* loaded from: classes.dex */
public final class l1 implements InterfaceC1196j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f13300a;

    /* renamed from: b, reason: collision with root package name */
    public int f13301b;

    /* renamed from: c, reason: collision with root package name */
    public final View f13302c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f13303d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f13304e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f13305f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13306g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f13307h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f13308i;
    public final CharSequence j;
    public Window.Callback k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13309l;

    /* renamed from: m, reason: collision with root package name */
    public C1197k f13310m;

    /* renamed from: n, reason: collision with root package name */
    public final int f13311n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f13312o;

    public l1(Toolbar toolbar, boolean z8) {
        boolean z9;
        Drawable drawable;
        this.f13311n = 0;
        this.f13300a = toolbar;
        this.f13307h = toolbar.getTitle();
        this.f13308i = toolbar.getSubtitle();
        if (this.f13307h != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f13306g = z9;
        this.f13305f = toolbar.getNavigationIcon();
        R.g J6 = R.g.J(toolbar.getContext(), null, AbstractC0805a.f11275a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) J6.f4988f;
        int i4 = 15;
        this.f13312o = J6.A(15);
        if (z8) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f13306g = true;
                Toolbar toolbar2 = this.f13300a;
                this.f13307h = text;
                if ((this.f13301b & 8) != 0) {
                    toolbar2.setTitle(text);
                    if (this.f13306g) {
                        P.O.n(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f13308i = text2;
                if ((this.f13301b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable A2 = J6.A(20);
            if (A2 != null) {
                this.f13304e = A2;
                c();
            }
            Drawable A8 = J6.A(17);
            if (A8 != null) {
                this.f13303d = A8;
                c();
            }
            if (this.f13305f == null && (drawable = this.f13312o) != null) {
                this.f13305f = drawable;
                Toolbar toolbar3 = this.f13300a;
                if ((this.f13301b & 4) != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f13302c;
                if (view != null && (this.f13301b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f13302c = inflate;
                if (inflate != null && (this.f13301b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.f13301b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.f8497w.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f8489o = resourceId2;
                C1178a0 c1178a0 = toolbar.f8481e;
                if (c1178a0 != null) {
                    c1178a0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f8490p = resourceId3;
                C1178a0 c1178a02 = toolbar.f8482f;
                if (c1178a02 != null) {
                    c1178a02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f13312o = toolbar.getNavigationIcon();
            } else {
                i4 = 11;
            }
            this.f13301b = i4;
        }
        J6.L();
        if (R.string.abc_action_bar_up_description != this.f13311n) {
            this.f13311n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i8 = this.f13311n;
                this.j = i8 != 0 ? toolbar.getContext().getString(i8) : null;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new k1(this));
    }

    public final void a(int i4) {
        View view;
        int i8 = this.f13301b ^ i4;
        this.f13301b = i4;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    b();
                }
                int i9 = this.f13301b & 4;
                Toolbar toolbar = this.f13300a;
                if (i9 != 0) {
                    Drawable drawable = this.f13305f;
                    if (drawable == null) {
                        drawable = this.f13312o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i8 & 3) != 0) {
                c();
            }
            int i10 = i8 & 8;
            Toolbar toolbar2 = this.f13300a;
            if (i10 != 0) {
                if ((i4 & 8) != 0) {
                    toolbar2.setTitle(this.f13307h);
                    toolbar2.setSubtitle(this.f13308i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i8 & 16) != 0 && (view = this.f13302c) != null) {
                if ((i4 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f13301b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f13300a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f13311n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i4 = this.f13301b;
        if ((i4 & 2) != 0) {
            if ((i4 & 1) != 0) {
                drawable = this.f13304e;
                if (drawable == null) {
                    drawable = this.f13303d;
                }
            } else {
                drawable = this.f13303d;
            }
        } else {
            drawable = null;
        }
        this.f13300a.setLogo(drawable);
    }
}
