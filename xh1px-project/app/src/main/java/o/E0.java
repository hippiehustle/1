package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import h.AbstractC0805a;
import java.lang.reflect.Method;
import n.InterfaceC1101C;

/* loaded from: classes.dex */
public class E0 implements InterfaceC1101C {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f13052D;

    /* renamed from: E, reason: collision with root package name */
    public static final Method f13053E;

    /* renamed from: A, reason: collision with root package name */
    public Rect f13054A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f13055B;

    /* renamed from: C, reason: collision with root package name */
    public final C1173A f13056C;

    /* renamed from: d, reason: collision with root package name */
    public final Context f13057d;

    /* renamed from: e, reason: collision with root package name */
    public ListAdapter f13058e;

    /* renamed from: f, reason: collision with root package name */
    public C1213s0 f13059f;

    /* renamed from: i, reason: collision with root package name */
    public int f13062i;
    public int j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13063l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13064m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13065n;

    /* renamed from: q, reason: collision with root package name */
    public T.b f13068q;

    /* renamed from: r, reason: collision with root package name */
    public View f13069r;

    /* renamed from: s, reason: collision with root package name */
    public AdapterView.OnItemClickListener f13070s;

    /* renamed from: t, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f13071t;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f13076y;

    /* renamed from: g, reason: collision with root package name */
    public final int f13060g = -2;

    /* renamed from: h, reason: collision with root package name */
    public int f13061h = -2;
    public final int k = 1002;

    /* renamed from: o, reason: collision with root package name */
    public int f13066o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final int f13067p = Integer.MAX_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public final B0 f13072u = new B0(this, 1);

    /* renamed from: v, reason: collision with root package name */
    public final D0 f13073v = new D0(this);

    /* renamed from: w, reason: collision with root package name */
    public final C0 f13074w = new C0(this);

    /* renamed from: x, reason: collision with root package name */
    public final B0 f13075x = new B0(this, 0);

    /* renamed from: z, reason: collision with root package name */
    public final Rect f13077z = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f13052D = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f13053E = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [o.A, android.widget.PopupWindow] */
    public E0(Context context, AttributeSet attributeSet, int i4, int i8) {
        Drawable drawable;
        int resourceId;
        this.f13057d = context;
        this.f13076y = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0805a.f11287o, i4, 0);
        this.f13062i = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f13063l = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i4, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0805a.f11291s, i4, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = h4.g.k(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f13056C = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final int a() {
        return this.f13062i;
    }

    @Override // n.InterfaceC1101C
    public final boolean b() {
        return this.f13056C.isShowing();
    }

    @Override // n.InterfaceC1101C
    public final void c() {
        int i4;
        boolean z8;
        int makeMeasureSpec;
        int i8;
        int i9;
        boolean z9;
        C1213s0 c1213s0;
        int i10;
        int i11;
        C1213s0 c1213s02 = this.f13059f;
        Context context = this.f13057d;
        C1173A c1173a = this.f13056C;
        if (c1213s02 == null) {
            C1213s0 p8 = p(context, !this.f13055B);
            this.f13059f = p8;
            p8.setAdapter(this.f13058e);
            this.f13059f.setOnItemClickListener(this.f13070s);
            this.f13059f.setFocusable(true);
            this.f13059f.setFocusableInTouchMode(true);
            this.f13059f.setOnItemSelectedListener(new C1225y0(0, this));
            this.f13059f.setOnScrollListener(this.f13074w);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f13071t;
            if (onItemSelectedListener != null) {
                this.f13059f.setOnItemSelectedListener(onItemSelectedListener);
            }
            c1173a.setContentView(this.f13059f);
        }
        Drawable background = c1173a.getBackground();
        Rect rect = this.f13077z;
        int i12 = 0;
        if (background != null) {
            background.getPadding(rect);
            int i13 = rect.top;
            i4 = rect.bottom + i13;
            if (!this.f13063l) {
                this.j = -i13;
            }
        } else {
            rect.setEmpty();
            i4 = 0;
        }
        if (c1173a.getInputMethodMode() == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        int a3 = AbstractC1227z0.a(c1173a, this.f13069r, this.j, z8);
        int i14 = this.f13060g;
        if (i14 == -1) {
            i9 = a3 + i4;
        } else {
            int i15 = this.f13061h;
            if (i15 != -2) {
                if (i15 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a4 = this.f13059f.a(makeMeasureSpec, a3);
            if (a4 > 0) {
                i8 = this.f13059f.getPaddingBottom() + this.f13059f.getPaddingTop() + i4;
            } else {
                i8 = 0;
            }
            i9 = a4 + i8;
        }
        if (this.f13056C.getInputMethodMode() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        c1173a.setWindowLayoutType(this.k);
        if (c1173a.isShowing()) {
            if (this.f13069r.isAttachedToWindow()) {
                int i16 = this.f13061h;
                if (i16 == -1) {
                    i16 = -1;
                } else if (i16 == -2) {
                    i16 = this.f13069r.getWidth();
                }
                if (i14 == -1) {
                    if (z9) {
                        i14 = i9;
                    } else {
                        i14 = -1;
                    }
                    if (z9) {
                        if (this.f13061h == -1) {
                            i11 = -1;
                        } else {
                            i11 = 0;
                        }
                        c1173a.setWidth(i11);
                        c1173a.setHeight(0);
                    } else {
                        if (this.f13061h == -1) {
                            i12 = -1;
                        }
                        c1173a.setWidth(i12);
                        c1173a.setHeight(-1);
                    }
                } else if (i14 == -2) {
                    i14 = i9;
                }
                c1173a.setOutsideTouchable(true);
                int i17 = i16;
                View view = this.f13069r;
                int i18 = this.f13062i;
                int i19 = this.j;
                if (i17 < 0) {
                    i10 = -1;
                } else {
                    i10 = i17;
                }
                if (i14 < 0) {
                    i14 = -1;
                }
                c1173a.update(view, i18, i19, i10, i14);
                return;
            }
            return;
        }
        int i20 = this.f13061h;
        if (i20 == -1) {
            i20 = -1;
        } else if (i20 == -2) {
            i20 = this.f13069r.getWidth();
        }
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = i9;
        }
        c1173a.setWidth(i20);
        c1173a.setHeight(i14);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f13052D;
            if (method != null) {
                try {
                    method.invoke(c1173a, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            A0.b(c1173a, true);
        }
        c1173a.setOutsideTouchable(true);
        c1173a.setTouchInterceptor(this.f13073v);
        if (this.f13065n) {
            c1173a.setOverlapAnchor(this.f13064m);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f13053E;
            if (method2 != null) {
                try {
                    method2.invoke(c1173a, this.f13054A);
                } catch (Exception e9) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e9);
                }
            }
        } else {
            A0.a(c1173a, this.f13054A);
        }
        c1173a.showAsDropDown(this.f13069r, this.f13062i, this.j, this.f13066o);
        this.f13059f.setSelection(-1);
        if ((!this.f13055B || this.f13059f.isInTouchMode()) && (c1213s0 = this.f13059f) != null) {
            c1213s0.setListSelectionHidden(true);
            c1213s0.requestLayout();
        }
        if (!this.f13055B) {
            this.f13076y.post(this.f13075x);
        }
    }

    public final Drawable d() {
        return this.f13056C.getBackground();
    }

    @Override // n.InterfaceC1101C
    public final void dismiss() {
        C1173A c1173a = this.f13056C;
        c1173a.dismiss();
        c1173a.setContentView(null);
        this.f13059f = null;
        this.f13076y.removeCallbacks(this.f13072u);
    }

    @Override // n.InterfaceC1101C
    public final C1213s0 e() {
        return this.f13059f;
    }

    public final void g(Drawable drawable) {
        this.f13056C.setBackgroundDrawable(drawable);
    }

    public final void h(int i4) {
        this.j = i4;
        this.f13063l = true;
    }

    public final void k(int i4) {
        this.f13062i = i4;
    }

    public final int m() {
        if (!this.f13063l) {
            return 0;
        }
        return this.j;
    }

    public void o(ListAdapter listAdapter) {
        T.b bVar = this.f13068q;
        if (bVar == null) {
            this.f13068q = new T.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f13058e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f13058e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f13068q);
        }
        C1213s0 c1213s0 = this.f13059f;
        if (c1213s0 != null) {
            c1213s0.setAdapter(this.f13058e);
        }
    }

    public C1213s0 p(Context context, boolean z8) {
        return new C1213s0(context, z8);
    }

    public final void q(int i4) {
        Drawable background = this.f13056C.getBackground();
        if (background != null) {
            Rect rect = this.f13077z;
            background.getPadding(rect);
            this.f13061h = rect.left + rect.right + i4;
            return;
        }
        this.f13061h = i4;
    }
}
