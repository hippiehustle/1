package A5;

import P.O;
import a.AbstractC0405a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import m.C1044g;
import n.InterfaceC1099A;
import n.y;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public abstract class q extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final g f382d;

    /* renamed from: e, reason: collision with root package name */
    public final i f383e;

    /* renamed from: f, reason: collision with root package name */
    public final l f384f;

    /* renamed from: g, reason: collision with root package name */
    public C1044g f385g;

    /* renamed from: h, reason: collision with root package name */
    public n f386h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [n.y, java.lang.Object, A5.l] */
    public q(Context context, AttributeSet attributeSet, int i4, int i8) {
        super(M5.a.a(context, attributeSet, i4, i8), attributeSet, i4);
        ?? obj = new Object();
        obj.f378e = false;
        this.f384f = obj;
        Context context2 = getContext();
        R.g i9 = x5.p.i(context2, attributeSet, AbstractC0645a.f10620I, i4, i8, 12, 10);
        g gVar = new g(context2, getClass(), getMaxItemCount());
        this.f382d = gVar;
        i a3 = a(context2);
        this.f383e = a3;
        obj.f377d = a3;
        obj.f379f = 1;
        a3.setPresenter(obj);
        gVar.b(obj, gVar.f12641a);
        getContext();
        obj.f377d.f352H = gVar;
        TypedArray typedArray = (TypedArray) i9.f4988f;
        if (typedArray.hasValue(6)) {
            a3.setIconTintList(i9.z(6));
        } else {
            a3.setIconTintList(a3.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(i9.z(13));
        }
        Drawable background = getBackground();
        ColorStateList i10 = h2.a.i(background);
        if (background == null || i10 != null) {
            G5.h hVar = new G5.h(G5.l.b(context2, attributeSet, i4, i8).a());
            if (i10 != null) {
                hVar.m(i10);
            }
            hVar.k(context2);
            WeakHashMap weakHashMap = O.f4214a;
            setBackground(hVar);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(AbstractC0405a.B(context2, i9, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            a3.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(AbstractC0405a.B(context2, i9, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, AbstractC0645a.f10619H);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(AbstractC0405a.C(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(G5.l.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new G5.a(0)).a());
            obtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            b(typedArray.getResourceId(15, 0));
        }
        i9.L();
        addView(a3);
        gVar.f12645e = new W0.d(1, this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f385g == null) {
            this.f385g = new C1044g(getContext());
        }
        return this.f385g;
    }

    public abstract i a(Context context);

    public final void b(int i4) {
        l lVar = this.f384f;
        lVar.f378e = true;
        getMenuInflater().inflate(i4, this.f382d);
        lVar.f378e = false;
        lVar.g(true);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f383e.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f383e.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f383e.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f383e.getItemActiveIndicatorMarginHorizontal();
    }

    public G5.l getItemActiveIndicatorShapeAppearance() {
        return this.f383e.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f383e.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f383e.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f383e.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f383e.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f383e.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f383e.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f383e.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f383e.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f383e.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f383e.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f383e.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f383e.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f382d;
    }

    public InterfaceC1099A getMenuView() {
        return this.f383e;
    }

    public l getPresenter() {
        return this.f384f;
    }

    public int getSelectedItemId() {
        return this.f383e.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof G5.h) {
            AbstractC1638C.L(this, (G5.h) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.f6209d);
        Bundle bundle = pVar.f381f;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f382d.f12659u;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = yVar.getId();
                    if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        yVar.d(parcelable2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, A5.p, V.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable k;
        ?? bVar = new V.b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bVar.f381f = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f382d.f12659u;
        if (copyOnWriteArrayList.isEmpty()) {
            return bVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = yVar.getId();
                if (id > 0 && (k = yVar.k()) != null) {
                    sparseArray.put(id, k);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return bVar;
    }

    public void setActiveIndicatorLabelPadding(int i4) {
        this.f383e.setActiveIndicatorLabelPadding(i4);
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        Drawable background = getBackground();
        if (background instanceof G5.h) {
            ((G5.h) background).l(f8);
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f383e.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z8) {
        this.f383e.setItemActiveIndicatorEnabled(z8);
    }

    public void setItemActiveIndicatorHeight(int i4) {
        this.f383e.setItemActiveIndicatorHeight(i4);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i4) {
        this.f383e.setItemActiveIndicatorMarginHorizontal(i4);
    }

    public void setItemActiveIndicatorShapeAppearance(G5.l lVar) {
        this.f383e.setItemActiveIndicatorShapeAppearance(lVar);
    }

    public void setItemActiveIndicatorWidth(int i4) {
        this.f383e.setItemActiveIndicatorWidth(i4);
    }

    public void setItemBackground(Drawable drawable) {
        this.f383e.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i4) {
        this.f383e.setItemBackgroundRes(i4);
    }

    public void setItemIconSize(int i4) {
        this.f383e.setItemIconSize(i4);
    }

    public void setItemIconSizeRes(int i4) {
        setItemIconSize(getResources().getDimensionPixelSize(i4));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f383e.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i4) {
        this.f383e.setItemPaddingBottom(i4);
    }

    public void setItemPaddingTop(int i4) {
        this.f383e.setItemPaddingTop(i4);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f383e.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i4) {
        this.f383e.setItemTextAppearanceActive(i4);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z8) {
        this.f383e.setItemTextAppearanceActiveBoldEnabled(z8);
    }

    public void setItemTextAppearanceInactive(int i4) {
        this.f383e.setItemTextAppearanceInactive(i4);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f383e.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i4) {
        i iVar = this.f383e;
        if (iVar.getLabelVisibilityMode() != i4) {
            iVar.setLabelVisibilityMode(i4);
            this.f384f.g(false);
        }
    }

    public void setOnItemSelectedListener(n nVar) {
        this.f386h = nVar;
    }

    public void setSelectedItemId(int i4) {
        g gVar = this.f382d;
        MenuItem findItem = gVar.findItem(i4);
        if (findItem != null && !gVar.q(findItem, this.f384f, 0)) {
            findItem.setChecked(true);
        }
    }

    public void setOnItemReselectedListener(m mVar) {
    }
}
