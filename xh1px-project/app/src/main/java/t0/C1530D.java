package t0;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import java.util.ArrayList;
import n1.AbstractC1149a;

/* renamed from: t0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1530D extends AbstractC1533a0 {

    /* renamed from: A, reason: collision with root package name */
    public Rect f14705A;

    /* renamed from: B, reason: collision with root package name */
    public long f14706B;

    /* renamed from: d, reason: collision with root package name */
    public float f14710d;

    /* renamed from: e, reason: collision with root package name */
    public float f14711e;

    /* renamed from: f, reason: collision with root package name */
    public float f14712f;

    /* renamed from: g, reason: collision with root package name */
    public float f14713g;

    /* renamed from: h, reason: collision with root package name */
    public float f14714h;

    /* renamed from: i, reason: collision with root package name */
    public float f14715i;
    public float j;
    public float k;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC1529C f14717m;

    /* renamed from: o, reason: collision with root package name */
    public int f14719o;

    /* renamed from: q, reason: collision with root package name */
    public int f14721q;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f14722r;

    /* renamed from: t, reason: collision with root package name */
    public VelocityTracker f14724t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f14725u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f14726v;

    /* renamed from: x, reason: collision with root package name */
    public GestureDetector f14728x;

    /* renamed from: y, reason: collision with root package name */
    public C1528B f14729y;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14707a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final float[] f14708b = new float[2];

    /* renamed from: c, reason: collision with root package name */
    public s0 f14709c = null;

    /* renamed from: l, reason: collision with root package name */
    public int f14716l = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f14718n = 0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f14720p = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final L5.x f14723s = new L5.x(12, this);

    /* renamed from: w, reason: collision with root package name */
    public View f14727w = null;

    /* renamed from: z, reason: collision with root package name */
    public final C1559z f14730z = new C1559z(this);

    public C1530D(AbstractC1529C abstractC1529C) {
        this.f14717m = abstractC1529C;
    }

    public static boolean n(View view, float f8, float f9, float f10, float f11) {
        if (f8 >= f10 && f8 <= f10 + view.getWidth() && f9 >= f11 && f9 <= f11 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // t0.AbstractC1533a0
    public final void d(Rect rect, View view, RecyclerView recyclerView, o0 o0Var) {
        rect.setEmpty();
    }

    @Override // t0.AbstractC1533a0
    public final void e(Canvas canvas, RecyclerView recyclerView, o0 o0Var) {
        float f8;
        float f9;
        if (this.f14709c != null) {
            float[] fArr = this.f14708b;
            m(fArr);
            f8 = fArr[0];
            f9 = fArr[1];
        } else {
            f8 = 0.0f;
            f9 = 0.0f;
        }
        s0 s0Var = this.f14709c;
        this.f14717m.getClass();
        ArrayList arrayList = this.f14720p;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1527A c1527a = (C1527A) arrayList.get(i4);
            s0 s0Var2 = c1527a.f14681e;
            float f10 = c1527a.f14677a;
            float f11 = c1527a.f14679c;
            if (f10 == f11) {
                c1527a.f14685i = s0Var2.f14950a.getTranslationX();
            } else {
                c1527a.f14685i = AbstractC1149a.a(f11, f10, c1527a.f14687m, f10);
            }
            float f12 = c1527a.f14678b;
            float f13 = c1527a.f14680d;
            if (f12 == f13) {
                c1527a.j = s0Var2.f14950a.getTranslationY();
            } else {
                c1527a.j = AbstractC1149a.a(f13, f12, c1527a.f14687m, f12);
            }
            int save = canvas.save();
            AbstractC1529C.e(recyclerView, c1527a.f14681e, c1527a.f14685i, c1527a.j, false);
            canvas.restoreToCount(save);
        }
        if (s0Var != null) {
            int save2 = canvas.save();
            AbstractC1529C.e(recyclerView, s0Var, f8, f9, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // t0.AbstractC1533a0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        boolean z8 = false;
        if (this.f14709c != null) {
            float[] fArr = this.f14708b;
            m(fArr);
            float f8 = fArr[0];
            float f9 = fArr[1];
        }
        s0 s0Var = this.f14709c;
        this.f14717m.getClass();
        ArrayList arrayList = this.f14720p;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1527A c1527a = (C1527A) arrayList.get(i4);
            int save = canvas.save();
            View view = c1527a.f14681e.f14950a;
            canvas.restoreToCount(save);
        }
        if (s0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i8 = size - 1; i8 >= 0; i8--) {
            C1527A c1527a2 = (C1527A) arrayList.get(i8);
            boolean z9 = c1527a2.f14686l;
            if (z9 && !c1527a2.f14684h) {
                arrayList.remove(i8);
            } else if (!z9) {
                z8 = true;
            }
        }
        if (z8) {
            recyclerView.invalidate();
        }
    }

    public final void g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f14722r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C1559z c1559z = this.f14730z;
        if (recyclerView2 != null) {
            recyclerView2.f0(this);
            RecyclerView recyclerView3 = this.f14722r;
            recyclerView3.f8968t.remove(c1559z);
            if (recyclerView3.f8970u == c1559z) {
                recyclerView3.f8970u = null;
            }
            ArrayList arrayList = this.f14722r.f8919F;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.f14720p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C1527A c1527a = (C1527A) arrayList2.get(0);
                c1527a.f14683g.cancel();
                this.f14717m.a(this.f14722r, c1527a.f14681e);
            }
            arrayList2.clear();
            this.f14727w = null;
            VelocityTracker velocityTracker = this.f14724t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f14724t = null;
            }
            C1528B c1528b = this.f14729y;
            if (c1528b != null) {
                c1528b.f14696a = false;
                this.f14729y = null;
            }
            if (this.f14728x != null) {
                this.f14728x = null;
            }
        }
        this.f14722r = recyclerView;
        Resources resources = recyclerView.getResources();
        this.f14712f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
        this.f14713g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
        this.f14721q = ViewConfiguration.get(this.f14722r.getContext()).getScaledTouchSlop();
        this.f14722r.i(this);
        this.f14722r.f8968t.add(c1559z);
        RecyclerView recyclerView4 = this.f14722r;
        if (recyclerView4.f8919F == null) {
            recyclerView4.f8919F = new ArrayList();
        }
        recyclerView4.f8919F.add(this);
        this.f14729y = new C1528B(this);
        this.f14728x = new GestureDetector(this.f14722r.getContext(), this.f14729y);
    }

    public final int h(int i4) {
        int i8;
        if ((i4 & 12) != 0) {
            int i9 = 4;
            if (this.f14714h > 0.0f) {
                i8 = 8;
            } else {
                i8 = 4;
            }
            VelocityTracker velocityTracker = this.f14724t;
            AbstractC1529C abstractC1529C = this.f14717m;
            if (velocityTracker != null && this.f14716l > -1) {
                float f8 = this.f14713g;
                abstractC1529C.getClass();
                velocityTracker.computeCurrentVelocity(1000, f8);
                float xVelocity = this.f14724t.getXVelocity(this.f14716l);
                float yVelocity = this.f14724t.getYVelocity(this.f14716l);
                if (xVelocity > 0.0f) {
                    i9 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i9 & i4) != 0 && i8 == i9 && abs >= this.f14712f && abs > Math.abs(yVelocity)) {
                    return i9;
                }
            }
            float width = this.f14722r.getWidth();
            abstractC1529C.getClass();
            float f9 = width * 0.5f;
            if ((i4 & i8) != 0 && Math.abs(this.f14714h) > f9) {
                return i8;
            }
            return 0;
        }
        return 0;
    }

    public final void i(int i4, int i8, MotionEvent motionEvent) {
        int b4;
        View l6;
        if (this.f14709c == null && i4 == 2 && this.f14718n != 2) {
            this.f14717m.getClass();
            if (this.f14722r.getScrollState() != 1) {
                AbstractC1537c0 layoutManager = this.f14722r.getLayoutManager();
                int i9 = this.f14716l;
                s0 s0Var = null;
                if (i9 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i9);
                    float x8 = motionEvent.getX(findPointerIndex) - this.f14710d;
                    float y4 = motionEvent.getY(findPointerIndex) - this.f14711e;
                    float abs = Math.abs(x8);
                    float abs2 = Math.abs(y4);
                    float f8 = this.f14721q;
                    if ((abs >= f8 || abs2 >= f8) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (l6 = l(motionEvent)) != null))) {
                        s0Var = this.f14722r.M(l6);
                    }
                }
                if (s0Var != null && (b4 = (AbstractC1529C.b(196611, this.f14722r.getLayoutDirection()) & 65280) >> 8) != 0) {
                    float x9 = motionEvent.getX(i8);
                    float y5 = motionEvent.getY(i8);
                    float f9 = x9 - this.f14710d;
                    float f10 = y5 - this.f14711e;
                    float abs3 = Math.abs(f9);
                    float abs4 = Math.abs(f10);
                    float f11 = this.f14721q;
                    if (abs3 >= f11 || abs4 >= f11) {
                        if (abs3 > abs4) {
                            if (f9 >= 0.0f || (b4 & 4) != 0) {
                                if (f9 > 0.0f && (b4 & 8) == 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (f10 >= 0.0f || (b4 & 1) != 0) {
                            if (f10 > 0.0f && (b4 & 2) == 0) {
                                return;
                            }
                        } else {
                            return;
                        }
                        this.f14715i = 0.0f;
                        this.f14714h = 0.0f;
                        this.f14716l = motionEvent.getPointerId(0);
                        q(s0Var, 1);
                    }
                }
            }
        }
    }

    public final int j(int i4) {
        int i8;
        if ((i4 & 3) != 0) {
            int i9 = 1;
            if (this.f14715i > 0.0f) {
                i8 = 2;
            } else {
                i8 = 1;
            }
            VelocityTracker velocityTracker = this.f14724t;
            AbstractC1529C abstractC1529C = this.f14717m;
            if (velocityTracker != null && this.f14716l > -1) {
                float f8 = this.f14713g;
                abstractC1529C.getClass();
                velocityTracker.computeCurrentVelocity(1000, f8);
                float xVelocity = this.f14724t.getXVelocity(this.f14716l);
                float yVelocity = this.f14724t.getYVelocity(this.f14716l);
                if (yVelocity > 0.0f) {
                    i9 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i9 & i4) != 0 && i9 == i8 && abs >= this.f14712f && abs > Math.abs(xVelocity)) {
                    return i9;
                }
            }
            float height = this.f14722r.getHeight();
            abstractC1529C.getClass();
            float f9 = height * 0.5f;
            if ((i4 & i8) != 0 && Math.abs(this.f14715i) > f9) {
                return i8;
            }
            return 0;
        }
        return 0;
    }

    public final void k(s0 s0Var, boolean z8) {
        ArrayList arrayList = this.f14720p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1527A c1527a = (C1527A) arrayList.get(size);
            if (c1527a.f14681e == s0Var) {
                c1527a.k |= z8;
                if (!c1527a.f14686l) {
                    c1527a.f14683g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View l(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y4 = motionEvent.getY();
        s0 s0Var = this.f14709c;
        if (s0Var != null) {
            View view = s0Var.f14950a;
            if (n(view, x8, y4, this.j + this.f14714h, this.k + this.f14715i)) {
                return view;
            }
        }
        ArrayList arrayList = this.f14720p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1527A c1527a = (C1527A) arrayList.get(size);
            View view2 = c1527a.f14681e.f14950a;
            if (n(view2, x8, y4, c1527a.f14685i, c1527a.j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.f14722r;
        for (int t8 = recyclerView.f8949i.t() - 1; t8 >= 0; t8--) {
            View s8 = recyclerView.f8949i.s(t8);
            float translationX = s8.getTranslationX();
            float translationY = s8.getTranslationY();
            if (x8 >= s8.getLeft() + translationX && x8 <= s8.getRight() + translationX && y4 >= s8.getTop() + translationY && y4 <= s8.getBottom() + translationY) {
                return s8;
            }
        }
        return null;
    }

    public final void m(float[] fArr) {
        if ((this.f14719o & 12) != 0) {
            fArr[0] = (this.j + this.f14714h) - this.f14709c.f14950a.getLeft();
        } else {
            fArr[0] = this.f14709c.f14950a.getTranslationX();
        }
        if ((this.f14719o & 3) != 0) {
            fArr[1] = (this.k + this.f14715i) - this.f14709c.f14950a.getTop();
        } else {
            fArr[1] = this.f14709c.f14950a.getTranslationY();
        }
    }

    public final void o(s0 s0Var) {
        char c6;
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i4;
        int i8;
        int i9;
        int i10;
        if (!this.f14722r.isLayoutRequested() && this.f14718n == 2) {
            AbstractC1529C abstractC1529C = this.f14717m;
            abstractC1529C.getClass();
            int i11 = (int) (this.j + this.f14714h);
            int i12 = (int) (this.k + this.f14715i);
            View view = s0Var.f14950a;
            if (Math.abs(i12 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i11 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.f14725u;
                if (arrayList2 == null) {
                    this.f14725u = new ArrayList();
                    this.f14726v = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.f14726v.clear();
                }
                int round = Math.round(this.j + this.f14714h);
                int round2 = Math.round(this.k + this.f14715i);
                int width = view.getWidth() + round;
                int height = view.getHeight() + round2;
                int i13 = (round + width) / 2;
                int i14 = (round2 + height) / 2;
                AbstractC1537c0 layoutManager = this.f14722r.getLayoutManager();
                int v8 = layoutManager.v();
                int i15 = 0;
                while (i15 < v8) {
                    View u8 = layoutManager.u(i15);
                    if (u8 == view) {
                        i4 = i15;
                    } else {
                        i4 = i15;
                        if (u8.getBottom() >= round2 && u8.getTop() <= height && u8.getRight() >= round && u8.getLeft() <= width) {
                            s0 M8 = this.f14722r.M(u8);
                            int abs5 = Math.abs(i13 - ((u8.getRight() + u8.getLeft()) / 2));
                            int abs6 = Math.abs(i14 - ((u8.getBottom() + u8.getTop()) / 2));
                            int i16 = (abs6 * abs6) + (abs5 * abs5);
                            i8 = i11;
                            int size = this.f14725u.size();
                            i9 = i12;
                            i10 = round;
                            int i17 = 0;
                            int i18 = 0;
                            while (i17 < size) {
                                int i19 = size;
                                if (i16 <= ((Integer) this.f14726v.get(i17)).intValue()) {
                                    break;
                                }
                                i18++;
                                i17++;
                                size = i19;
                            }
                            this.f14725u.add(i18, M8);
                            this.f14726v.add(i18, Integer.valueOf(i16));
                            i15 = i4 + 1;
                            i11 = i8;
                            i12 = i9;
                            round = i10;
                        }
                    }
                    i8 = i11;
                    i9 = i12;
                    i10 = round;
                    i15 = i4 + 1;
                    i11 = i8;
                    i12 = i9;
                    round = i10;
                }
                int i20 = i11;
                int i21 = i12;
                ArrayList arrayList3 = this.f14725u;
                if (arrayList3.size() != 0) {
                    int width2 = view.getWidth() + i20;
                    int height2 = view.getHeight() + i21;
                    int left2 = i20 - view.getLeft();
                    int top2 = i21 - view.getTop();
                    int size2 = arrayList3.size();
                    s0 s0Var2 = null;
                    int i22 = -1;
                    int i23 = 0;
                    while (i23 < size2) {
                        s0 s0Var3 = (s0) arrayList3.get(i23);
                        if (left2 > 0 && (right = s0Var3.f14950a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (s0Var3.f14950a.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i22) {
                                i22 = abs4;
                                s0Var2 = s0Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = s0Var3.f14950a.getLeft() - i20) > 0 && s0Var3.f14950a.getLeft() < view.getLeft() && (abs3 = Math.abs(left)) > i22) {
                            i22 = abs3;
                            s0Var2 = s0Var3;
                        }
                        if (top2 < 0 && (top = s0Var3.f14950a.getTop() - i21) > 0 && s0Var3.f14950a.getTop() < view.getTop() && (abs2 = Math.abs(top)) > i22) {
                            i22 = abs2;
                            s0Var2 = s0Var3;
                        }
                        if (top2 > 0 && (bottom = s0Var3.f14950a.getBottom() - height2) < 0 && s0Var3.f14950a.getBottom() > view.getBottom() && (abs = Math.abs(bottom)) > i22) {
                            i22 = abs;
                            s0Var2 = s0Var3;
                        }
                        i23++;
                        arrayList3 = arrayList;
                    }
                    if (s0Var2 == null) {
                        this.f14725u.clear();
                        this.f14726v.clear();
                        return;
                    }
                    View view2 = s0Var2.f14950a;
                    int b4 = s0Var2.b();
                    s0Var.b();
                    abstractC1529C.f(this.f14722r, s0Var, s0Var2);
                    RecyclerView recyclerView = this.f14722r;
                    AbstractC1537c0 layoutManager2 = recyclerView.getLayoutManager();
                    if (layoutManager2 instanceof LinearLayoutManager) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                        linearLayoutManager.c("Cannot drop a view during a scroll or layout calculation");
                        linearLayoutManager.O0();
                        linearLayoutManager.f1();
                        int K = AbstractC1537c0.K(view);
                        int K8 = AbstractC1537c0.K(view2);
                        if (K < K8) {
                            c6 = 1;
                        } else {
                            c6 = 65535;
                        }
                        if (linearLayoutManager.f8894u) {
                            if (c6 == 1) {
                                linearLayoutManager.h1(K8, linearLayoutManager.f8891r.i() - (linearLayoutManager.f8891r.e(view) + linearLayoutManager.f8891r.g(view2)));
                                return;
                            } else {
                                linearLayoutManager.h1(K8, linearLayoutManager.f8891r.i() - linearLayoutManager.f8891r.d(view2));
                                return;
                            }
                        }
                        if (c6 == 65535) {
                            linearLayoutManager.h1(K8, linearLayoutManager.f8891r.g(view2));
                            return;
                        } else {
                            linearLayoutManager.h1(K8, linearLayoutManager.f8891r.d(view2) - linearLayoutManager.f8891r.e(view));
                            return;
                        }
                    }
                    if (layoutManager2.d()) {
                        if (AbstractC1537c0.A(view2) <= recyclerView.getPaddingLeft()) {
                            recyclerView.j0(b4);
                        }
                        if (AbstractC1537c0.D(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.j0(b4);
                        }
                    }
                    if (layoutManager2.e()) {
                        if (AbstractC1537c0.E(view2) <= recyclerView.getPaddingTop()) {
                            recyclerView.j0(b4);
                        }
                        if (AbstractC1537c0.y(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.j0(b4);
                        }
                    }
                }
            }
        }
    }

    public final void p(View view) {
        if (view == this.f14727w) {
            this.f14727w = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x008b, code lost:
    
        if (r6 > 0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(s0 s0Var, int i4) {
        AbstractC1529C abstractC1529C;
        boolean z8;
        boolean z9;
        int c6;
        VelocityTracker velocityTracker;
        ?? r16;
        float signum;
        ?? r02;
        Z itemAnimator;
        long j;
        if (s0Var == this.f14709c && i4 == this.f14718n) {
            return;
        }
        this.f14706B = Long.MIN_VALUE;
        int i8 = this.f14718n;
        k(s0Var, true);
        this.f14718n = i4;
        if (i4 == 2) {
            if (s0Var != null) {
                this.f14727w = s0Var.f14950a;
            } else {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
        }
        int i9 = (1 << ((i4 * 8) + 8)) - 1;
        s0 s0Var2 = this.f14709c;
        AbstractC1529C abstractC1529C2 = this.f14717m;
        if (s0Var2 != null) {
            View view = s0Var2.f14950a;
            if (view.getParent() != null) {
                if (i8 != 2 && this.f14718n != 2) {
                    abstractC1529C2.getClass();
                    int b4 = (AbstractC1529C.b(196611, this.f14722r.getLayoutDirection()) & 65280) >> 8;
                    if (b4 != 0) {
                        if (Math.abs(this.f14714h) > Math.abs(this.f14715i)) {
                            int h8 = h(b4);
                            if (h8 > 0) {
                                c6 = AbstractC1529C.c(h8, this.f14722r.getLayoutDirection());
                            } else {
                                c6 = j(b4);
                            }
                            velocityTracker = this.f14724t;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.f14724t = null;
                            }
                            float f8 = 0.0f;
                            if (c6 == 1 && c6 != 2) {
                                if (c6 != 4 && c6 != 8 && c6 != 16 && c6 != 32) {
                                    r02 = 4;
                                    signum = 0.0f;
                                    r16 = 0;
                                } else {
                                    r16 = 0;
                                    f8 = Math.signum(this.f14714h) * this.f14722r.getWidth();
                                    r02 = 4;
                                    signum = 0.0f;
                                }
                            } else {
                                r16 = 0;
                                signum = Math.signum(this.f14715i) * this.f14722r.getHeight();
                                r02 = 4;
                            }
                            if (i8 == 2) {
                                r02 = 8;
                            } else if (c6 > 0) {
                                r02 = 2;
                            }
                            float[] fArr = this.f14708b;
                            m(fArr);
                            ?? r18 = r02;
                            z8 = r16;
                            C1527A c1527a = new C1527A(this, s0Var2, i8, fArr[r16], fArr[1], f8, signum, c6, s0Var2);
                            RecyclerView recyclerView = this.f14722r;
                            abstractC1529C2.getClass();
                            itemAnimator = recyclerView.getItemAnimator();
                            if (itemAnimator == null) {
                                if (r18 == 8) {
                                    j = 200;
                                } else {
                                    j = 250;
                                }
                            } else if (r18 == 8) {
                                j = itemAnimator.f14795e;
                            } else {
                                j = itemAnimator.f14794d;
                            }
                            ValueAnimator valueAnimator = c1527a.f14683g;
                            valueAnimator.setDuration(j);
                            this.f14720p.add(c1527a);
                            s0Var2.p(z8);
                            valueAnimator.start();
                            abstractC1529C = abstractC1529C2;
                            z9 = true;
                        } else {
                            int j5 = j(b4);
                            if (j5 > 0) {
                                c6 = j5;
                            } else {
                                int h9 = h(b4);
                                if (h9 > 0) {
                                    c6 = AbstractC1529C.c(h9, this.f14722r.getLayoutDirection());
                                }
                            }
                            velocityTracker = this.f14724t;
                            if (velocityTracker != null) {
                            }
                            float f82 = 0.0f;
                            if (c6 == 1) {
                            }
                            r16 = 0;
                            signum = Math.signum(this.f14715i) * this.f14722r.getHeight();
                            r02 = 4;
                            if (i8 == 2) {
                            }
                            float[] fArr2 = this.f14708b;
                            m(fArr2);
                            ?? r182 = r02;
                            z8 = r16;
                            C1527A c1527a2 = new C1527A(this, s0Var2, i8, fArr2[r16], fArr2[1], f82, signum, c6, s0Var2);
                            RecyclerView recyclerView2 = this.f14722r;
                            abstractC1529C2.getClass();
                            itemAnimator = recyclerView2.getItemAnimator();
                            if (itemAnimator == null) {
                            }
                            ValueAnimator valueAnimator2 = c1527a2.f14683g;
                            valueAnimator2.setDuration(j);
                            this.f14720p.add(c1527a2);
                            s0Var2.p(z8);
                            valueAnimator2.start();
                            abstractC1529C = abstractC1529C2;
                            z9 = true;
                        }
                    }
                }
                c6 = 0;
                velocityTracker = this.f14724t;
                if (velocityTracker != null) {
                }
                float f822 = 0.0f;
                if (c6 == 1) {
                }
                r16 = 0;
                signum = Math.signum(this.f14715i) * this.f14722r.getHeight();
                r02 = 4;
                if (i8 == 2) {
                }
                float[] fArr22 = this.f14708b;
                m(fArr22);
                ?? r1822 = r02;
                z8 = r16;
                C1527A c1527a22 = new C1527A(this, s0Var2, i8, fArr22[r16], fArr22[1], f822, signum, c6, s0Var2);
                RecyclerView recyclerView22 = this.f14722r;
                abstractC1529C2.getClass();
                itemAnimator = recyclerView22.getItemAnimator();
                if (itemAnimator == null) {
                }
                ValueAnimator valueAnimator22 = c1527a22.f14683g;
                valueAnimator22.setDuration(j);
                this.f14720p.add(c1527a22);
                s0Var2.p(z8);
                valueAnimator22.start();
                abstractC1529C = abstractC1529C2;
                z9 = true;
            } else {
                z8 = false;
                p(view);
                abstractC1529C = abstractC1529C2;
                abstractC1529C.a(this.f14722r, s0Var2);
                z9 = false;
            }
            this.f14709c = null;
        } else {
            abstractC1529C = abstractC1529C2;
            z8 = false;
            z9 = false;
        }
        if (s0Var != null) {
            View view2 = s0Var.f14950a;
            RecyclerView recyclerView3 = this.f14722r;
            abstractC1529C.getClass();
            this.f14719o = (AbstractC1529C.b(196611, recyclerView3.getLayoutDirection()) & i9) >> (this.f14718n * 8);
            this.j = view2.getLeft();
            this.k = view2.getTop();
            this.f14709c = s0Var;
            if (i4 == 2) {
                view2.performHapticFeedback(z8 ? 1 : 0);
            }
        }
        ViewParent parent = this.f14722r.getParent();
        if (parent != null) {
            if (this.f14709c != null) {
                z8 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z8);
        }
        if (!z9) {
            this.f14722r.getLayoutManager().f14815f = true;
        }
        abstractC1529C.getClass();
        this.f14722r.invalidate();
    }

    public final void r(int i4, int i8, MotionEvent motionEvent) {
        float x8 = motionEvent.getX(i8);
        float y4 = motionEvent.getY(i8);
        float f8 = x8 - this.f14710d;
        this.f14714h = f8;
        this.f14715i = y4 - this.f14711e;
        if ((i4 & 4) == 0) {
            this.f14714h = Math.max(0.0f, f8);
        }
        if ((i4 & 8) == 0) {
            this.f14714h = Math.min(0.0f, this.f14714h);
        }
        if ((i4 & 1) == 0) {
            this.f14715i = Math.max(0.0f, this.f14715i);
        }
        if ((i4 & 2) == 0) {
            this.f14715i = Math.min(0.0f, this.f14715i);
        }
    }
}
