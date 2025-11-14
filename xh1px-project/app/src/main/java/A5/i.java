package A5;

import J0.C0067a;
import P.O;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import f5.AbstractC0710a;
import h4.AbstractC0832f;
import h5.C0833a;
import java.util.HashSet;
import java.util.WeakHashMap;
import n.InterfaceC1099A;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public abstract class i extends ViewGroup implements InterfaceC1099A {

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f343I = {R.attr.state_checked};

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f344J = {-16842910};

    /* renamed from: A, reason: collision with root package name */
    public int f345A;

    /* renamed from: B, reason: collision with root package name */
    public int f346B;

    /* renamed from: C, reason: collision with root package name */
    public int f347C;

    /* renamed from: D, reason: collision with root package name */
    public G5.l f348D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f349E;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f350F;

    /* renamed from: G, reason: collision with root package name */
    public l f351G;

    /* renamed from: H, reason: collision with root package name */
    public n.m f352H;

    /* renamed from: d, reason: collision with root package name */
    public final C0067a f353d;

    /* renamed from: e, reason: collision with root package name */
    public final h f354e;

    /* renamed from: f, reason: collision with root package name */
    public final O.d f355f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f356g;

    /* renamed from: h, reason: collision with root package name */
    public int f357h;

    /* renamed from: i, reason: collision with root package name */
    public f[] f358i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f359l;

    /* renamed from: m, reason: collision with root package name */
    public int f360m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f361n;

    /* renamed from: o, reason: collision with root package name */
    public final ColorStateList f362o;

    /* renamed from: p, reason: collision with root package name */
    public int f363p;

    /* renamed from: q, reason: collision with root package name */
    public int f364q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f365r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f366s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f367t;

    /* renamed from: u, reason: collision with root package name */
    public int f368u;

    /* renamed from: v, reason: collision with root package name */
    public final SparseArray f369v;

    /* renamed from: w, reason: collision with root package name */
    public int f370w;

    /* renamed from: x, reason: collision with root package name */
    public int f371x;

    /* renamed from: y, reason: collision with root package name */
    public int f372y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f373z;

    public i(Context context) {
        super(context);
        this.f355f = new O.d(5);
        this.f356g = new SparseArray(5);
        int i4 = 0;
        this.j = 0;
        this.k = 0;
        this.f369v = new SparseArray(5);
        this.f370w = -1;
        this.f371x = -1;
        this.f372y = -1;
        this.f349E = false;
        this.f362o = c();
        if (isInEditMode()) {
            this.f353d = null;
        } else {
            C0067a c0067a = new C0067a();
            this.f353d = c0067a;
            c0067a.O(0);
            c0067a.D(AbstractC0832f.x(getContext(), com.buzbuz.smartautoclicker.R.attr.motionDurationMedium4, getResources().getInteger(com.buzbuz.smartautoclicker.R.integer.material_motion_duration_long_1)));
            c0067a.F(AbstractC0832f.y(getContext(), com.buzbuz.smartautoclicker.R.attr.motionEasingStandard, AbstractC0710a.f10767b));
            c0067a.L(new J0.p());
        }
        this.f354e = new h(i4, this);
        WeakHashMap weakHashMap = O.f4214a;
        setImportantForAccessibility(1);
    }

    public static boolean f(int i4, int i8) {
        if (i4 == -1) {
            if (i8 > 3) {
                return true;
            }
            return false;
        }
        if (i4 == 0) {
            return true;
        }
        return false;
    }

    private f getNewItem() {
        f fVar = (f) this.f355f.a();
        if (fVar == null) {
            return e(getContext());
        }
        return fVar;
    }

    private void setBadgeIfNeeded(f fVar) {
        C0833a c0833a;
        int id = fVar.getId();
        if (id != -1 && (c0833a = (C0833a) this.f369v.get(id)) != null) {
            fVar.setBadge(c0833a);
        }
    }

    public final void a() {
        removeAllViews();
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                if (fVar != null) {
                    this.f355f.c(fVar);
                    fVar.i(fVar.f329q);
                    fVar.f335w = null;
                    fVar.f311C = 0.0f;
                    fVar.f318d = false;
                }
            }
        }
        if (this.f352H.f12646f.size() == 0) {
            this.j = 0;
            this.k = 0;
            this.f358i = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < this.f352H.f12646f.size(); i4++) {
            hashSet.add(Integer.valueOf(this.f352H.getItem(i4).getItemId()));
        }
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.f369v;
            if (i8 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i8);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i8++;
        }
        this.f358i = new f[this.f352H.f12646f.size()];
        boolean f8 = f(this.f357h, this.f352H.l().size());
        for (int i9 = 0; i9 < this.f352H.f12646f.size(); i9++) {
            this.f351G.f378e = true;
            this.f352H.getItem(i9).setCheckable(true);
            this.f351G.f378e = false;
            f newItem = getNewItem();
            this.f358i[i9] = newItem;
            newItem.setIconTintList(this.f359l);
            newItem.setIconSize(this.f360m);
            newItem.setTextColor(this.f362o);
            newItem.setTextAppearanceInactive(this.f363p);
            newItem.setTextAppearanceActive(this.f364q);
            newItem.setTextAppearanceActiveBoldEnabled(this.f365r);
            newItem.setTextColor(this.f361n);
            int i10 = this.f370w;
            if (i10 != -1) {
                newItem.setItemPaddingTop(i10);
            }
            int i11 = this.f371x;
            if (i11 != -1) {
                newItem.setItemPaddingBottom(i11);
            }
            int i12 = this.f372y;
            if (i12 != -1) {
                newItem.setActiveIndicatorLabelPadding(i12);
            }
            newItem.setActiveIndicatorWidth(this.f345A);
            newItem.setActiveIndicatorHeight(this.f346B);
            newItem.setActiveIndicatorMarginHorizontal(this.f347C);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.f349E);
            newItem.setActiveIndicatorEnabled(this.f373z);
            Drawable drawable = this.f366s;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f368u);
            }
            newItem.setItemRippleColor(this.f367t);
            newItem.setShifting(f8);
            newItem.setLabelVisibilityMode(this.f357h);
            n.o oVar = (n.o) this.f352H.getItem(i9);
            newItem.a(oVar);
            newItem.setItemPosition(i9);
            int i13 = oVar.f12669a;
            newItem.setOnTouchListener((View.OnTouchListener) this.f356g.get(i13));
            newItem.setOnClickListener(this.f354e);
            int i14 = this.j;
            if (i14 != 0 && i13 == i14) {
                this.k = i9;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f352H.f12646f.size() - 1, this.k);
        this.k = min;
        this.f352H.getItem(min).setChecked(true);
    }

    @Override // n.InterfaceC1099A
    public final void b(n.m mVar) {
        this.f352H = mVar;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            ColorStateList o7 = AbstractC1492c.o(getContext(), typedValue.resourceId);
            if (!getContext().getTheme().resolveAttribute(com.buzbuz.smartautoclicker.R.attr.colorPrimary, typedValue, true)) {
                return null;
            }
            int i4 = typedValue.data;
            int defaultColor = o7.getDefaultColor();
            int[] iArr = f343I;
            int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
            int[] iArr3 = f344J;
            return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{o7.getColorForState(iArr3, defaultColor), i4, defaultColor});
        }
        return null;
    }

    public final G5.h d() {
        if (this.f348D != null && this.f350F != null) {
            G5.h hVar = new G5.h(this.f348D);
            hVar.m(this.f350F);
            return hVar;
        }
        return null;
    }

    public abstract f e(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.f372y;
    }

    public SparseArray<C0833a> getBadgeDrawables() {
        return this.f369v;
    }

    public ColorStateList getIconTintList() {
        return this.f359l;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f350F;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f373z;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f346B;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f347C;
    }

    public G5.l getItemActiveIndicatorShapeAppearance() {
        return this.f348D;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f345A;
    }

    public Drawable getItemBackground() {
        f[] fVarArr = this.f358i;
        if (fVarArr != null && fVarArr.length > 0) {
            return fVarArr[0].getBackground();
        }
        return this.f366s;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f368u;
    }

    public int getItemIconSize() {
        return this.f360m;
    }

    public int getItemPaddingBottom() {
        return this.f371x;
    }

    public int getItemPaddingTop() {
        return this.f370w;
    }

    public ColorStateList getItemRippleColor() {
        return this.f367t;
    }

    public int getItemTextAppearanceActive() {
        return this.f364q;
    }

    public int getItemTextAppearanceInactive() {
        return this.f363p;
    }

    public ColorStateList getItemTextColor() {
        return this.f361n;
    }

    public int getLabelVisibilityMode() {
        return this.f357h;
    }

    public n.m getMenu() {
        return this.f352H;
    }

    public int getSelectedItemId() {
        return this.j;
    }

    public int getSelectedItemPosition() {
        return this.k;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f352H.l().size(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(int i4) {
        this.f372y = i4;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setActiveIndicatorLabelPadding(i4);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f359l = colorStateList;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f350F = colorStateList;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z8) {
        this.f373z = z8;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setActiveIndicatorEnabled(z8);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i4) {
        this.f346B = i4;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setActiveIndicatorHeight(i4);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i4) {
        this.f347C = i4;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setActiveIndicatorMarginHorizontal(i4);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z8) {
        this.f349E = z8;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setActiveIndicatorResizeable(z8);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(G5.l lVar) {
        this.f348D = lVar;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i4) {
        this.f345A = i4;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setActiveIndicatorWidth(i4);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f366s = drawable;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i4) {
        this.f368u = i4;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setItemBackground(i4);
            }
        }
    }

    public void setItemIconSize(int i4) {
        this.f360m = i4;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setIconSize(i4);
            }
        }
    }

    public void setItemPaddingBottom(int i4) {
        this.f371x = i4;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setItemPaddingBottom(i4);
            }
        }
    }

    public void setItemPaddingTop(int i4) {
        this.f370w = i4;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setItemPaddingTop(i4);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f367t = colorStateList;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i4) {
        this.f364q = i4;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setTextAppearanceActive(i4);
                ColorStateList colorStateList = this.f361n;
                if (colorStateList != null) {
                    fVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z8) {
        this.f365r = z8;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setTextAppearanceActiveBoldEnabled(z8);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i4) {
        this.f363p = i4;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setTextAppearanceInactive(i4);
                ColorStateList colorStateList = this.f361n;
                if (colorStateList != null) {
                    fVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f361n = colorStateList;
        f[] fVarArr = this.f358i;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i4) {
        this.f357h = i4;
    }

    public void setPresenter(l lVar) {
        this.f351G = lVar;
    }
}
