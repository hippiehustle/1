package E1;

import A1.h;
import H1.d;
import P.S;
import Z5.n;
import android.animation.LayoutTransition;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import com.buzbuz.smartautoclicker.R;
import h4.AbstractC0832f;
import h6.AbstractC0837b;
import h7.AbstractC0842e;
import h7.u;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.NoSuchElementException;
import k4.C0971c;
import n6.InterfaceC1162a;
import o6.j;
import s3.AbstractC1492c;
import w1.e;

/* loaded from: classes.dex */
public abstract class c extends e {

    /* renamed from: A, reason: collision with root package name */
    public A4.c f1156A;

    /* renamed from: B, reason: collision with root package name */
    public final n f1157B;

    /* renamed from: C, reason: collision with root package name */
    public float f1158C;

    /* renamed from: D, reason: collision with root package name */
    public ImageButton f1159D;

    /* renamed from: E, reason: collision with root package name */
    public View f1160E;

    /* renamed from: F, reason: collision with root package name */
    public View f1161F;

    /* renamed from: G, reason: collision with root package name */
    public WindowManager.LayoutParams f1162G;

    /* renamed from: H, reason: collision with root package name */
    public final A1.e f1163H;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1164p;

    /* renamed from: q, reason: collision with root package name */
    public final WindowManager.LayoutParams f1165q;

    /* renamed from: r, reason: collision with root package name */
    public final WindowManager.LayoutParams f1166r;

    /* renamed from: s, reason: collision with root package name */
    public final H1.a f1167s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1168t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1169u;

    /* renamed from: v, reason: collision with root package name */
    public WindowManager f1170v;

    /* renamed from: w, reason: collision with root package name */
    public ViewGroup f1171w;

    /* renamed from: x, reason: collision with root package name */
    public ViewGroup f1172x;

    /* renamed from: y, reason: collision with root package name */
    public ViewGroup f1173y;

    /* renamed from: z, reason: collision with root package name */
    public d f1174z;

    public /* synthetic */ c(int i4) {
        this((i4 & 1) != 0 ? null : Integer.valueOf(R.style.AppTheme), false);
    }

    public static void D(c cVar) {
        cVar.hashCode();
        ViewGroup viewGroup = cVar.f1171w;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            ViewGroup viewGroup2 = cVar.f1172x;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                View view = cVar.f1161F;
                if (view != null) {
                    view.setVisibility(8);
                }
                super.C();
                if (cVar.f1169u) {
                    cVar.f1169u = false;
                    cVar.i();
                    return;
                }
                return;
            }
            j.i("menuBackground");
            throw null;
        }
        j.i("menuLayout");
        throw null;
    }

    @Override // w1.e
    public final void B() {
        View view;
        if (this.j.f8862d == EnumC0504o.f8848f) {
            H1.a aVar = this.f1167s;
            if (!aVar.f1878c) {
                super.B();
                H(l().f7104e.f7095b);
                hashCode();
                if (!(this instanceof C0971c)) {
                    view = this.f1161F;
                } else {
                    view = null;
                }
                ViewGroup viewGroup = this.f1171w;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    ViewGroup viewGroup2 = this.f1172x;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(0);
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        ViewGroup viewGroup3 = this.f1172x;
                        if (viewGroup3 != null) {
                            a aVar2 = new a(this, 3);
                            AlphaAnimation alphaAnimation = aVar.f1876a;
                            if (!aVar.f1878c) {
                                viewGroup3.getVisibility();
                                viewGroup3.toString();
                                aVar.f1878c = true;
                                u.l(alphaAnimation, null, new A1.n(aVar, 4, aVar2), 1);
                                if (aVar.f1881f) {
                                    aVar.f1879d.cancel();
                                    aVar.f1880e.cancel();
                                    aVar.f1881f = false;
                                }
                                viewGroup3.measure(1073741824, 1073741824);
                                viewGroup3.startAnimation(alphaAnimation);
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup4 = (ViewGroup) view;
                                    if (viewGroup4.getChildCount() == 1) {
                                        S s8 = new S(0, viewGroup4);
                                        if (s8.hasNext()) {
                                            ((View) s8.next()).startAnimation(aVar.f1877b);
                                            return;
                                        }
                                        throw new NoSuchElementException("Sequence is empty.");
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        j.i("menuBackground");
                        throw null;
                    }
                    j.i("menuBackground");
                    throw null;
                }
                j.i("menuLayout");
                throw null;
            }
        }
    }

    @Override // w1.e
    public final void C() {
        View view;
        if (this.j.f8862d.compareTo(EnumC0504o.f8849g) >= 0) {
            H1.a aVar = this.f1167s;
            if (!aVar.f1881f) {
                if (this.j.f8862d == EnumC0504o.f8850h) {
                    x();
                }
                N(l().f7104e.f7095b);
                hashCode();
                if (!(this instanceof C0971c)) {
                    view = this.f1161F;
                } else {
                    view = null;
                }
                ViewGroup viewGroup = this.f1172x;
                if (viewGroup != null) {
                    a aVar2 = new a(this, 2);
                    AlphaAnimation alphaAnimation = aVar.f1879d;
                    if (!aVar.f1881f) {
                        aVar.f1881f = true;
                        u.l(alphaAnimation, null, new A1.n(aVar, 3, aVar2), 1);
                        if (aVar.f1878c) {
                            aVar.f1876a.cancel();
                            aVar.f1877b.cancel();
                            aVar.f1878c = false;
                        }
                        viewGroup.startAnimation(alphaAnimation);
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) view;
                            if (viewGroup2.getChildCount() == 1) {
                                S s8 = new S(0, viewGroup2);
                                if (s8.hasNext()) {
                                    ((View) s8.next()).startAnimation(aVar.f1880e);
                                    return;
                                }
                                throw new NoSuchElementException("Sequence is empty.");
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                j.i("menuBackground");
                throw null;
            }
        }
    }

    public final void E(InterfaceC1162a interfaceC1162a) {
        d dVar = this.f1174z;
        if (dVar != null) {
            if (dVar.f1892e) {
                interfaceC1162a.a();
                return;
            }
            dVar.f1892e = true;
            dVar.f1891d.m(dVar.f1890c);
            interfaceC1162a.a();
            return;
        }
        j.i("resizeController");
        throw null;
    }

    public final H1.b F() {
        return (H1.b) this.f1157B.getValue();
    }

    public Size G(ViewGroup viewGroup) {
        j.e(viewGroup, "backgroundView");
        viewGroup.measure(0, 0);
        return new Size(viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
    }

    public final void H(int i4) {
        Point point;
        H1.b F2 = F();
        SharedPreferences sharedPreferences = F2.f1882a;
        Point point2 = F2.f1884c;
        if (point2 == null) {
            F2.f1885d = Integer.valueOf(i4);
            if (i4 != 1) {
                if (i4 != 2) {
                    point2 = null;
                } else {
                    point = new Point(sharedPreferences.getInt("Menu_X_Landscape_Position", 0), sharedPreferences.getInt("Menu_Y_Landscape_Position", 0));
                }
            } else {
                point = new Point(sharedPreferences.getInt("Menu_X_Portrait_Position", 0), sharedPreferences.getInt("Menu_Y_Portrait_Position", 0));
            }
            point2 = point;
            F2.f1886e = point2;
        }
        if (point2 != null && point2.x != 0 && point2.y != 0) {
            R(point2);
            return;
        }
        ViewGroup viewGroup = this.f1171w;
        if (viewGroup != null) {
            AbstractC0837b.h(viewGroup, new a(this, 1));
        } else {
            j.i("menuLayout");
            throw null;
        }
    }

    public abstract FrameLayout I(LayoutInflater layoutInflater);

    public View J() {
        return null;
    }

    public abstract void K(int i4);

    public final void L(Size size) {
        int width = size.getWidth();
        WindowManager.LayoutParams layoutParams = this.f1166r;
        layoutParams.width = width;
        layoutParams.height = size.getHeight();
        if (this.j.f8862d.compareTo(EnumC0504o.f8849g) >= 0) {
            size.getWidth();
            size.getHeight();
            WindowManager windowManager = this.f1170v;
            if (windowManager != null) {
                ViewGroup viewGroup = this.f1171w;
                if (viewGroup != null) {
                    AbstractC0842e.z(windowManager, viewGroup, layoutParams);
                    return;
                } else {
                    j.i("menuLayout");
                    throw null;
                }
            }
            j.i("windowManager");
            throw null;
        }
    }

    public final void N(int i4) {
        H1.b F2 = F();
        WindowManager.LayoutParams layoutParams = this.f1166r;
        Point point = new Point(layoutParams.x, layoutParams.y);
        SharedPreferences sharedPreferences = F2.f1882a;
        if (F2.f1884c != null) {
            return;
        }
        point.toString();
        if (i4 != 1) {
            if (i4 != 2) {
                return;
            }
            sharedPreferences.edit().putInt("Menu_X_Landscape_Position", point.x).putInt("Menu_Y_Landscape_Position", point.y).apply();
            return;
        }
        sharedPreferences.edit().putInt("Menu_X_Portrait_Position", point.x).putInt("Menu_Y_Portrait_Position", point.y).apply();
    }

    public final void O(View view, boolean z8, boolean z9) {
        boolean z10;
        float f8;
        j.e(view, "view");
        if (!z8 && !z9) {
            z10 = false;
        } else {
            z10 = true;
        }
        view.setEnabled(z10);
        if (z8) {
            f8 = 1.0f;
        } else {
            f8 = this.f1158C;
        }
        view.setAlpha(f8);
    }

    public final void P(View view, boolean z8) {
        int i4;
        j.e(view, "view");
        hashCode();
        view.toString();
        if (z8) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view.setVisibility(i4);
        d dVar = this.f1174z;
        if (dVar != null) {
            if (!dVar.f1892e) {
                if (dVar != null) {
                    L(dVar.a());
                    return;
                } else {
                    j.i("resizeController");
                    throw null;
                }
            }
            return;
        }
        j.i("resizeController");
        throw null;
    }

    public final void Q(boolean z8) {
        View view = this.f1161F;
        if (view != null) {
            hashCode();
            if (z8) {
                view.setVisibility(0);
                ImageButton imageButton = this.f1159D;
                if (imageButton != null) {
                    imageButton.setImageResource(R.drawable.ic_visible_on);
                }
            } else {
                view.setVisibility(8);
                ImageButton imageButton2 = this.f1159D;
                if (imageButton2 != null) {
                    imageButton2.setImageResource(R.drawable.ic_visible_off);
                }
            }
            M(z8);
        }
    }

    public final void R(Point point) {
        Point point2 = l().f7104e.f7094a;
        int i4 = point2.x;
        ViewGroup viewGroup = this.f1171w;
        if (viewGroup != null) {
            if (i4 >= viewGroup.getWidth()) {
                int i8 = point2.y;
                ViewGroup viewGroup2 = this.f1171w;
                if (viewGroup2 != null) {
                    if (i8 >= viewGroup2.getHeight()) {
                        int i9 = point.x;
                        int i10 = point2.x;
                        ViewGroup viewGroup3 = this.f1171w;
                        if (viewGroup3 != null) {
                            int f8 = AbstractC0832f.f(i9, 0, i10 - viewGroup3.getWidth());
                            WindowManager.LayoutParams layoutParams = this.f1166r;
                            layoutParams.x = f8;
                            int i11 = point.y;
                            int i12 = point2.y;
                            ViewGroup viewGroup4 = this.f1171w;
                            if (viewGroup4 != null) {
                                layoutParams.y = AbstractC0832f.f(i11, 0, i12 - viewGroup4.getHeight());
                                if (this.j.f8862d.compareTo(EnumC0504o.f8848f) >= 0) {
                                    WindowManager windowManager = this.f1170v;
                                    if (windowManager != null) {
                                        ViewGroup viewGroup5 = this.f1171w;
                                        if (viewGroup5 != null) {
                                            AbstractC0842e.z(windowManager, viewGroup5, layoutParams);
                                            return;
                                        } else {
                                            j.i("menuLayout");
                                            throw null;
                                        }
                                    }
                                    j.i("windowManager");
                                    throw null;
                                }
                                return;
                            }
                            j.i("menuLayout");
                            throw null;
                        }
                        j.i("menuLayout");
                        throw null;
                    }
                    return;
                }
                j.i("menuLayout");
                throw null;
            }
            return;
        }
        j.i("menuLayout");
        throw null;
    }

    @Override // w1.e
    public final void i() {
        if (this.j.f8862d.compareTo(EnumC0504o.f8848f) >= 0) {
            if (this.j.f8862d.compareTo(EnumC0504o.f8849g) >= 0) {
                C();
            }
            if (this.f1167s.f1881f) {
                hashCode();
                this.f1169u = true;
                return;
            }
            H1.b F2 = F();
            F2.getClass();
            A1.e eVar = this.f1163H;
            j.e(eVar, "listener");
            F2.f1883b.remove(eVar);
            N(l().f7104e.f7095b);
            WindowManager windowManager = this.f1170v;
            if (windowManager != null) {
                ViewGroup viewGroup = this.f1171w;
                if (viewGroup != null) {
                    windowManager.removeView(viewGroup);
                    View view = this.f1161F;
                    if (view != null) {
                        WindowManager windowManager2 = this.f1170v;
                        if (windowManager2 != null) {
                            windowManager2.removeView(view);
                        } else {
                            j.i("windowManager");
                            throw null;
                        }
                    }
                    this.f1161F = null;
                    d dVar = this.f1174z;
                    if (dVar != null) {
                        LayoutTransition layoutTransition = dVar.f1889b.getLayoutTransition();
                        if (layoutTransition != null) {
                            layoutTransition.removeTransitionListener(dVar.f1894g);
                        }
                        super.i();
                        return;
                    }
                    j.i("resizeController");
                    throw null;
                }
                j.i("menuLayout");
                throw null;
            }
            j.i("windowManager");
            throw null;
        }
    }

    @Override // w1.e
    public final void j(PrintWriter printWriter, CharSequence charSequence) {
        j.e(charSequence, "prefix");
        super.j(printWriter, charSequence);
        String b4 = AbstractC1492c.b(charSequence);
        printWriter.append((CharSequence) b4).append((CharSequence) ("resumeOnceShown=" + this.f1168t + "; ")).append((CharSequence) ("destroyOnceHidden=" + this.f1169u + "; ")).println();
        H1.a aVar = this.f1167s;
        aVar.getClass();
        j.e(b4, "prefix");
        printWriter.append((CharSequence) b4).append((CharSequence) ("showIsRunning=" + aVar.f1878c + "; ")).append((CharSequence) ("hideIsRunning=" + aVar.f1881f + "; ")).println();
        H1.b F2 = F();
        F2.getClass();
        printWriter.append((CharSequence) b4).append((CharSequence) ("lastLoadedOrientation=" + F2.f1885d + "; ")).append((CharSequence) ("lastLoadedPosition=" + F2.f1886e + "; ")).append((CharSequence) ("lockedMenuPosition=" + F2.f1884c + "; ")).println();
    }

    @Override // w1.e
    public void p() {
        Object systemService = k().getSystemService((Class<Object>) WindowManager.class);
        j.b(systemService);
        this.f1170v = (WindowManager) systemService;
        this.f1158C = k().getResources().getFraction(R.dimen.alpha_menu_item_disabled, 1, 1);
        Object systemService2 = k().getSystemService((Class<Object>) LayoutInflater.class);
        j.d(systemService2, "getSystemService(...)");
        this.f1171w = I((LayoutInflater) systemService2);
        this.f1161F = J();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(this.f1165q);
        Point point = l().f7104e.f7094a;
        layoutParams.width = point.x;
        layoutParams.height = point.y;
        this.f1162G = layoutParams;
        ViewGroup viewGroup = this.f1171w;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.menu_background);
            j.d(findViewById, "findViewById(...)");
            this.f1172x = (ViewGroup) findViewById;
            ViewGroup viewGroup2 = this.f1171w;
            if (viewGroup2 != null) {
                View findViewById2 = viewGroup2.findViewById(R.id.menu_items);
                j.d(findViewById2, "findViewById(...)");
                ViewGroup viewGroup3 = (ViewGroup) findViewById2;
                this.f1173y = viewGroup3;
                int childCount = viewGroup3.getChildCount();
                int i4 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = viewGroup3.getChildAt(i8);
                    int id = childAt.getId();
                    if (id == R.id.btn_move) {
                        this.f1160E = childAt;
                        childAt.setOnTouchListener(new b(0, this));
                    } else if (id == R.id.btn_hide_overlay) {
                        this.f1159D = (ImageButton) childAt;
                        Q(true);
                        childAt.setOnClickListener(new B2.b(3, this));
                    } else {
                        A(childAt, new h(4, this));
                    }
                }
                this.f1156A = new A4.c(new A1.e(1, this, c.class, "updateMenuPosition", "updateMenuPosition(Landroid/graphics/Point;)V", 0, 0, 5));
                WindowManager.LayoutParams layoutParams2 = this.f1166r;
                layoutParams2.gravity = 8388659;
                WindowManager.LayoutParams layoutParams3 = this.f1162G;
                if (layoutParams3 != null) {
                    layoutParams3.gravity = 8388659;
                    H1.b F2 = F();
                    F2.getClass();
                    A1.e eVar = this.f1163H;
                    j.e(eVar, "listener");
                    F2.f1883b.add(eVar);
                    H(l().f7104e.f7095b);
                    View view = this.f1160E;
                    if (view != null) {
                        if (F().f1884c != null) {
                            i4 = 8;
                        }
                        view.setVisibility(i4);
                    }
                    ViewGroup viewGroup4 = this.f1172x;
                    if (viewGroup4 != null) {
                        ViewGroup viewGroup5 = this.f1173y;
                        if (viewGroup5 != null) {
                            this.f1174z = new d(viewGroup4, viewGroup5, G(viewGroup4), new A1.e(1, this, c.class, "onNewWindowSize", "onNewWindowSize(Landroid/util/Size;)V", 0, 0, 6));
                            View view2 = this.f1161F;
                            if (view2 != null) {
                                if (!(this instanceof C0971c)) {
                                    view2.setVisibility(8);
                                }
                                WindowManager windowManager = this.f1170v;
                                if (windowManager != null) {
                                    WindowManager.LayoutParams layoutParams4 = this.f1162G;
                                    if (layoutParams4 != null) {
                                        if (!AbstractC0842e.y(windowManager, view2, layoutParams4)) {
                                            i();
                                            return;
                                        }
                                    } else {
                                        j.i("overlayLayoutParams");
                                        throw null;
                                    }
                                } else {
                                    j.i("windowManager");
                                    throw null;
                                }
                            }
                            if (!(this instanceof C0971c)) {
                                ViewGroup viewGroup6 = this.f1172x;
                                if (viewGroup6 != null) {
                                    viewGroup6.setVisibility(8);
                                } else {
                                    j.i("menuBackground");
                                    throw null;
                                }
                            }
                            WindowManager windowManager2 = this.f1170v;
                            if (windowManager2 != null) {
                                ViewGroup viewGroup7 = this.f1171w;
                                if (viewGroup7 != null) {
                                    if (!AbstractC0842e.y(windowManager2, viewGroup7, layoutParams2)) {
                                        i();
                                        return;
                                    }
                                    return;
                                }
                                j.i("menuLayout");
                                throw null;
                            }
                            j.i("windowManager");
                            throw null;
                        }
                        j.i("buttonsContainer");
                        throw null;
                    }
                    j.i("menuBackground");
                    throw null;
                }
                j.i("overlayLayoutParams");
                throw null;
            }
            j.i("menuLayout");
            throw null;
        }
        j.i("menuLayout");
        throw null;
    }

    @Override // w1.e
    public final void s() {
        boolean z8 = true;
        int i4 = 2;
        if (l().f7104e.f7095b == 2) {
            i4 = 1;
        }
        N(i4);
        H(l().f7104e.f7095b);
        if (this.j.f8862d.compareTo(EnumC0504o.f8849g) >= 0) {
            WindowManager windowManager = this.f1170v;
            if (windowManager != null) {
                ViewGroup viewGroup = this.f1171w;
                if (viewGroup != null) {
                    WindowManager.LayoutParams layoutParams = this.f1166r;
                    AbstractC0842e.z(windowManager, viewGroup, layoutParams);
                    View view = this.f1161F;
                    if (view == null) {
                        return;
                    }
                    if (this.f1164p) {
                        this.f1161F = J();
                        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                        layoutParams2.copyFrom(this.f1165q);
                        Point point = l().f7104e.f7094a;
                        layoutParams2.width = point.x;
                        layoutParams2.height = point.y;
                        layoutParams2.gravity = 8388659;
                        this.f1162G = layoutParams2;
                        C0512x c0512x = this.j;
                        EnumC0504o enumC0504o = c0512x.f8862d;
                        c0512x.g(EnumC0504o.f8848f);
                        WindowManager windowManager2 = this.f1170v;
                        if (windowManager2 != null) {
                            windowManager2.removeView(view);
                            ViewGroup viewGroup2 = this.f1171w;
                            if (viewGroup2 != null) {
                                windowManager2.removeView(viewGroup2);
                                View view2 = this.f1161F;
                                if (view2 != null) {
                                    WindowManager.LayoutParams layoutParams3 = this.f1162G;
                                    if (layoutParams3 != null) {
                                        if (!AbstractC0842e.y(windowManager2, view2, layoutParams3)) {
                                            i();
                                            return;
                                        }
                                    } else {
                                        j.i("overlayLayoutParams");
                                        throw null;
                                    }
                                }
                                ViewGroup viewGroup3 = this.f1171w;
                                if (viewGroup3 != null) {
                                    if (!AbstractC0842e.y(windowManager2, viewGroup3, layoutParams)) {
                                        i();
                                        return;
                                    }
                                    this.j.g(enumC0504o);
                                    if (view.getVisibility() != 0) {
                                        z8 = false;
                                    }
                                    Q(z8);
                                    return;
                                }
                                j.i("menuLayout");
                                throw null;
                            }
                            j.i("menuLayout");
                            throw null;
                        }
                        j.i("windowManager");
                        throw null;
                    }
                    Point point2 = l().f7104e.f7094a;
                    WindowManager.LayoutParams layoutParams4 = this.f1162G;
                    if (layoutParams4 != null) {
                        layoutParams4.width = point2.x;
                        layoutParams4.height = point2.y;
                        WindowManager windowManager3 = this.f1170v;
                        if (windowManager3 != null) {
                            AbstractC0842e.z(windowManager3, view, layoutParams4);
                            return;
                        } else {
                            j.i("windowManager");
                            throw null;
                        }
                    }
                    j.i("overlayLayoutParams");
                    throw null;
                }
                j.i("menuLayout");
                throw null;
            }
            j.i("windowManager");
            throw null;
        }
    }

    @Override // w1.e
    public final void z() {
        if (this.j.f8862d == EnumC0504o.f8848f) {
            B();
        }
        if (this.j.f8862d != EnumC0504o.f8849g) {
            return;
        }
        if (this.f1167s.f1878c) {
            hashCode();
            this.f1168t = true;
            return;
        }
        d dVar = this.f1174z;
        if (dVar != null) {
            L(dVar.a());
            super.z();
        } else {
            j.i("resizeController");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Integer num, boolean z8) {
        super(num, false);
        int i4 = 0;
        this.f1164p = z8;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2032, 262920, -3);
        if (Build.VERSION.SDK_INT >= 34) {
            layoutParams.setCanPlayMoveAnimation(false);
        } else {
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
            try {
                Class<?> cls = Class.forName("android.view.WindowManager$LayoutParams");
                Field field = cls.getField("PRIVATE_FLAG_NO_MOVE_ANIMATION");
                j.d(field, "getField(...)");
                Field field2 = cls.getField("privateFlags");
                field2.setInt(layoutParams2, field.getInt(layoutParams2) | field2.getInt(layoutParams2));
            } catch (Exception unused) {
                Log.e("WindowManagerExt", "Can't disable move animations !");
            }
        }
        this.f1165q = layoutParams;
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(layoutParams);
        this.f1166r = layoutParams3;
        this.f1167s = new H1.a();
        this.f1157B = new n(new a(this, i4));
        this.f1158C = 1.0f;
        this.f1163H = new A1.e(1, this, c.class, "onLockedPositionChanged", "onLockedPositionChanged(Landroid/graphics/Point;)V", 0, 0, 7);
    }

    public void M(boolean z8) {
    }
}
