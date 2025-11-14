package androidx.appcompat.widget;

import P.U;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import i.LayoutInflaterFactory2C0860C;
import i.s;
import n.m;
import o.C1187f;
import o.C1197k;
import o.InterfaceC1192h0;
import o.InterfaceC1194i0;
import o.l1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f8409d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f8410e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f8411f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f8412g;

    /* renamed from: h, reason: collision with root package name */
    public TypedValue f8413h;

    /* renamed from: i, reason: collision with root package name */
    public TypedValue f8414i;
    public final Rect j;
    public InterfaceC1192h0 k;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.j = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f8413h == null) {
            this.f8413h = new TypedValue();
        }
        return this.f8413h;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f8414i == null) {
            this.f8414i = new TypedValue();
        }
        return this.f8414i;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f8411f == null) {
            this.f8411f = new TypedValue();
        }
        return this.f8411f;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f8412g == null) {
            this.f8412g = new TypedValue();
        }
        return this.f8412g;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f8409d == null) {
            this.f8409d = new TypedValue();
        }
        return this.f8409d;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f8410e == null) {
            this.f8410e = new TypedValue();
        }
        return this.f8410e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1192h0 interfaceC1192h0 = this.k;
        if (interfaceC1192h0 != null) {
            interfaceC1192h0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1197k c1197k;
        super.onDetachedFromWindow();
        InterfaceC1192h0 interfaceC1192h0 = this.k;
        if (interfaceC1192h0 != null) {
            LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = ((s) interfaceC1192h0).f11732d;
            InterfaceC1194i0 interfaceC1194i0 = layoutInflaterFactory2C0860C.f11591u;
            if (interfaceC1194i0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1194i0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((l1) actionBarOverlayLayout.f8373h).f13300a.f8480d;
                if (actionMenuView != null && (c1197k = actionMenuView.f8398w) != null) {
                    c1197k.c();
                    C1187f c1187f = c1197k.f13289x;
                    if (c1187f != null && c1187f.b()) {
                        c1187f.f12712i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0860C.f11596z != null) {
                layoutInflaterFactory2C0860C.f11585o.getDecorView().removeCallbacks(layoutInflaterFactory2C0860C.f11550A);
                if (layoutInflaterFactory2C0860C.f11596z.isShowing()) {
                    try {
                        layoutInflaterFactory2C0860C.f11596z.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0860C.f11596z = null;
            }
            U u8 = layoutInflaterFactory2C0860C.f11551B;
            if (u8 != null) {
                u8.b();
            }
            m mVar = layoutInflaterFactory2C0860C.x(0).f11540h;
            if (mVar != null) {
                mVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i4, int i8) {
        boolean z8;
        int i9;
        boolean z9;
        int i10;
        int measuredWidth;
        TypedValue typedValue;
        int i11;
        int i12;
        float fraction;
        TypedValue typedValue2;
        int i13;
        int i14;
        float fraction2;
        TypedValue typedValue3;
        int i15;
        int i16;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z10 = true;
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z8 = true;
        } else {
            z8 = false;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i8);
        Rect rect = this.j;
        if (mode == Integer.MIN_VALUE) {
            if (z8) {
                typedValue3 = this.f8412g;
            } else {
                typedValue3 = this.f8411f;
            }
            if (typedValue3 != null && (i15 = typedValue3.type) != 0) {
                if (i15 == 5) {
                    fraction3 = typedValue3.getDimension(displayMetrics);
                } else if (i15 == 6) {
                    int i17 = displayMetrics.widthPixels;
                    fraction3 = typedValue3.getFraction(i17, i17);
                } else {
                    i16 = 0;
                    if (i16 > 0) {
                        i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i4)), 1073741824);
                        z9 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            if (z8) {
                                typedValue2 = this.f8413h;
                            } else {
                                typedValue2 = this.f8414i;
                            }
                            if (typedValue2 != null && (i13 = typedValue2.type) != 0) {
                                if (i13 == 5) {
                                    fraction2 = typedValue2.getDimension(displayMetrics);
                                } else if (i13 == 6) {
                                    int i18 = displayMetrics.heightPixels;
                                    fraction2 = typedValue2.getFraction(i18, i18);
                                } else {
                                    i14 = 0;
                                    if (i14 > 0) {
                                        i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i8)), 1073741824);
                                        super.onMeasure(i9, i10);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z9 && mode == Integer.MIN_VALUE) {
                                            if (!z8) {
                                                typedValue = this.f8410e;
                                            } else {
                                                typedValue = this.f8409d;
                                            }
                                            if (typedValue != null && (i11 = typedValue.type) != 0) {
                                                if (i11 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i11 == 6) {
                                                    int i19 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i19, i19);
                                                } else {
                                                    i12 = 0;
                                                    if (i12 > 0) {
                                                        i12 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i12) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                                                        if (!z10) {
                                                            super.onMeasure(makeMeasureSpec, i10);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                                i12 = (int) fraction;
                                                if (i12 > 0) {
                                                }
                                                if (measuredWidth < i12) {
                                                }
                                            }
                                        }
                                        z10 = false;
                                        if (!z10) {
                                        }
                                    }
                                }
                                i14 = (int) fraction2;
                                if (i14 > 0) {
                                }
                            }
                        }
                        i10 = i8;
                        super.onMeasure(i9, i10);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z9) {
                            if (!z8) {
                            }
                            if (typedValue != null) {
                                if (i11 != 5) {
                                }
                                i12 = (int) fraction;
                                if (i12 > 0) {
                                }
                                if (measuredWidth < i12) {
                                }
                            }
                        }
                        z10 = false;
                        if (!z10) {
                        }
                    }
                }
                i16 = (int) fraction3;
                if (i16 > 0) {
                }
            }
        }
        i9 = i4;
        z9 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i10 = i8;
        super.onMeasure(i9, i10);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z9) {
        }
        z10 = false;
        if (!z10) {
        }
    }

    public void setAttachListener(InterfaceC1192h0 interfaceC1192h0) {
        this.k = interfaceC1192h0;
    }
}
