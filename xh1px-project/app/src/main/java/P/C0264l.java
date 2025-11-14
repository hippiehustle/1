package P;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: P.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264l {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f4289a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f4290b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f4291c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4292d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f4293e;

    public C0264l(ViewGroup viewGroup) {
        this.f4291c = viewGroup;
    }

    public final boolean a(float f8, float f9, boolean z8) {
        ViewParent e9;
        if (this.f4292d && (e9 = e(0)) != null) {
            try {
                return e9.onNestedFling(this.f4291c, f8, f9, z8);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public final boolean b(float f8, float f9) {
        ViewParent e9;
        if (this.f4292d && (e9 = e(0)) != null) {
            try {
                return e9.onNestedPreFling(this.f4291c, f8, f9);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public final boolean c(int i4, int i8, int i9, int[] iArr, int[] iArr2) {
        ViewParent e9;
        int i10;
        int i11;
        int[] iArr3;
        if (!this.f4292d || (e9 = e(i9)) == null) {
            return false;
        }
        if (i4 == 0 && i8 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f4291c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            if (this.f4293e == null) {
                this.f4293e = new int[2];
            }
            iArr3 = this.f4293e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e9 instanceof InterfaceC0265m) {
            ((InterfaceC0265m) e9).c(viewGroup, i4, i8, iArr3, i9);
        } else if (i9 == 0) {
            try {
                e9.onNestedPreScroll(viewGroup, i4, i8, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean d(int i4, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent e9;
        int i12;
        int i13;
        int[] iArr3;
        if (this.f4292d && (e9 = e(i11)) != null) {
            if (i4 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    return false;
                }
            } else {
                ViewGroup viewGroup = this.f4291c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i12 = iArr[0];
                    i13 = iArr[1];
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                if (iArr2 == null) {
                    if (this.f4293e == null) {
                        this.f4293e = new int[2];
                    }
                    int[] iArr4 = this.f4293e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e9 instanceof InterfaceC0266n) {
                    ((InterfaceC0266n) e9).d(viewGroup, i4, i8, i9, i10, i11, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i9;
                    iArr3[1] = iArr3[1] + i10;
                    if (e9 instanceof InterfaceC0265m) {
                        ((InterfaceC0265m) e9).e(viewGroup, i4, i8, i9, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            e9.onNestedScroll(viewGroup, i4, i8, i9, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedScroll", e10);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i12;
                    iArr[1] = iArr[1] - i13;
                }
                return true;
            }
        }
        return false;
    }

    public final ViewParent e(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return null;
            }
            return this.f4290b;
        }
        return this.f4289a;
    }

    public final boolean f(int i4) {
        if (e(i4) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i4, int i8) {
        boolean onStartNestedScroll;
        if (!f(i8)) {
            if (this.f4292d) {
                View view = this.f4291c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z8 = parent instanceof InterfaceC0265m;
                    if (z8) {
                        onStartNestedScroll = ((InterfaceC0265m) parent).f(view2, view, i4, i8);
                    } else {
                        if (i8 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i4);
                            } catch (AbstractMethodError e9) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e9);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i8 != 0) {
                            if (i8 == 1) {
                                this.f4290b = parent;
                            }
                        } else {
                            this.f4289a = parent;
                        }
                        if (z8) {
                            ((InterfaceC0265m) parent).a(view2, view, i4, i8);
                        } else if (i8 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i4);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i4) {
        ViewParent e9 = e(i4);
        if (e9 != null) {
            boolean z8 = e9 instanceof InterfaceC0265m;
            ViewGroup viewGroup = this.f4291c;
            if (z8) {
                ((InterfaceC0265m) e9).b(viewGroup, i4);
            } else if (i4 == 0) {
                try {
                    e9.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i4 != 0) {
                if (i4 == 1) {
                    this.f4290b = null;
                    return;
                }
                return;
            }
            this.f4289a = null;
        }
    }
}
