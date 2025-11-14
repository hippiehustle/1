package i;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0503n;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.e0;
import c.C0550d;
import c.C0551e;
import g0.AbstractComponentCallbacksC0755y;
import g0.C0731A;
import g0.T;
import g0.b0;
import g0.d0;
import i.AbstractActivityC0870i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k0.C0946a;
import m.C1039b;
import m.C1044g;
import m0.C1050a;
import o.C1216u;
import o.L0;
import o.q1;
import u6.InterfaceC1642c;

/* renamed from: i.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0870i extends c.l implements InterfaceC0871j {

    /* renamed from: B, reason: collision with root package name */
    public LayoutInflaterFactory2C0860C f11710B;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11713y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11714z;

    /* renamed from: w, reason: collision with root package name */
    public final W0.c f11711w = new W0.c(29, new C0731A(this));

    /* renamed from: x, reason: collision with root package name */
    public final C0512x f11712x = new C0512x(this);

    /* renamed from: A, reason: collision with root package name */
    public boolean f11709A = true;

    public AbstractActivityC0870i() {
        ((A.i) this.f9337h.f89f).k("android:support:lifecycle", new C0550d(this, 1));
        final int i4 = 0;
        i(new O.a(this) { // from class: g0.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0870i f11132b;

            {
                this.f11132b = this;
            }

            @Override // O.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        this.f11132b.f11711w.o();
                        return;
                    default:
                        this.f11132b.f11711w.o();
                        return;
                }
            }
        });
        final int i8 = 1;
        this.f9345r.add(new O.a(this) { // from class: g0.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0870i f11132b;

            {
                this.f11132b = this;
            }

            @Override // O.a
            public final void accept(Object obj) {
                switch (i8) {
                    case 0:
                        this.f11132b.f11711w.o();
                        return;
                    default:
                        this.f11132b.f11711w.o();
                        return;
                }
            }
        });
        j(new C0551e(this, 1));
        ((A.i) this.f9337h.f89f).k("androidx:appcompat", new B0.a(this));
        j(new O4.a(this, 5));
    }

    public static boolean q(T t8) {
        AbstractActivityC0870i abstractActivityC0870i;
        boolean z8 = false;
        for (AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y : t8.f10902c.k()) {
            if (abstractComponentCallbacksC0755y != null) {
                C0731A c0731a = abstractComponentCallbacksC0755y.f11129y;
                if (c0731a == null) {
                    abstractActivityC0870i = null;
                } else {
                    abstractActivityC0870i = c0731a.f10846m;
                }
                if (abstractActivityC0870i != null) {
                    z8 |= q(abstractComponentCallbacksC0755y.i());
                }
                d0 d0Var = abstractComponentCallbacksC0755y.f11104U;
                EnumC0504o enumC0504o = EnumC0504o.f8849g;
                EnumC0504o enumC0504o2 = EnumC0504o.f8848f;
                if (d0Var != null) {
                    d0Var.c();
                    if (d0Var.f11009h.f8862d.compareTo(enumC0504o) >= 0) {
                        abstractComponentCallbacksC0755y.f11104U.f11009h.g(enumC0504o2);
                        z8 = true;
                    }
                }
                if (abstractComponentCallbacksC0755y.f11103T.f8862d.compareTo(enumC0504o) >= 0) {
                    abstractComponentCallbacksC0755y.f11103T.g(enumC0504o2);
                    z8 = true;
                }
            }
        }
        return z8;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) n();
        layoutInflaterFactory2C0860C.u();
        ((ViewGroup) layoutInflaterFactory2C0860C.f11553D.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0860C.f11586p.a(layoutInflaterFactory2C0860C.f11585o.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) n();
        layoutInflaterFactory2C0860C.f11566R = true;
        int i15 = layoutInflaterFactory2C0860C.f11570V;
        if (i15 == -100) {
            i15 = AbstractC0877p.f11723e;
        }
        int C8 = layoutInflaterFactory2C0860C.C(context, i15);
        int i16 = 0;
        if (AbstractC0877p.c(context) && AbstractC0877p.c(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!AbstractC0877p.f11727i) {
                    AbstractC0877p.f11722d.execute(new RunnableC0872k(context, i16));
                }
            } else {
                synchronized (AbstractC0877p.f11728l) {
                    try {
                        L.d dVar = AbstractC0877p.f11724f;
                        if (dVar == null) {
                            if (AbstractC0877p.f11725g == null) {
                                AbstractC0877p.f11725g = L.d.a(E.e.e(context));
                            }
                            if (!AbstractC0877p.f11725g.f2743a.f2744a.isEmpty()) {
                                AbstractC0877p.f11724f = AbstractC0877p.f11725g;
                            }
                        } else if (!dVar.equals(AbstractC0877p.f11725g)) {
                            L.d dVar2 = AbstractC0877p.f11724f;
                            AbstractC0877p.f11725g = dVar2;
                            E.e.d(context, dVar2.f2743a.f2744a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            }
        }
        L.d n3 = LayoutInflaterFactory2C0860C.n(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0860C.r(context, C8, n3, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C1039b) {
            try {
                ((C1039b) context).a(LayoutInflaterFactory2C0860C.r(context, C8, n3, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C0860C.f11549m0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f8 = configuration3.fontScale;
                    float f9 = configuration4.fontScale;
                    if (f8 != f9) {
                        configuration.fontScale = f9;
                    }
                    int i17 = configuration3.mcc;
                    int i18 = configuration4.mcc;
                    if (i17 != i18) {
                        configuration.mcc = i18;
                    }
                    int i19 = configuration3.mnc;
                    int i20 = configuration4.mnc;
                    if (i19 != i20) {
                        configuration.mnc = i20;
                    }
                    int i21 = Build.VERSION.SDK_INT;
                    v.a(configuration3, configuration4, configuration);
                    int i22 = configuration3.touchscreen;
                    int i23 = configuration4.touchscreen;
                    if (i22 != i23) {
                        configuration.touchscreen = i23;
                    }
                    int i24 = configuration3.keyboard;
                    int i25 = configuration4.keyboard;
                    if (i24 != i25) {
                        configuration.keyboard = i25;
                    }
                    int i26 = configuration3.keyboardHidden;
                    int i27 = configuration4.keyboardHidden;
                    if (i26 != i27) {
                        configuration.keyboardHidden = i27;
                    }
                    int i28 = configuration3.navigation;
                    int i29 = configuration4.navigation;
                    if (i28 != i29) {
                        configuration.navigation = i29;
                    }
                    int i30 = configuration3.navigationHidden;
                    int i31 = configuration4.navigationHidden;
                    if (i30 != i31) {
                        configuration.navigationHidden = i31;
                    }
                    int i32 = configuration3.orientation;
                    int i33 = configuration4.orientation;
                    if (i32 != i33) {
                        configuration.orientation = i33;
                    }
                    int i34 = configuration3.screenLayout & 15;
                    int i35 = configuration4.screenLayout & 15;
                    if (i34 != i35) {
                        configuration.screenLayout |= i35;
                    }
                    int i36 = configuration3.screenLayout & 192;
                    int i37 = configuration4.screenLayout & 192;
                    if (i36 != i37) {
                        configuration.screenLayout |= i37;
                    }
                    int i38 = configuration3.screenLayout & 48;
                    int i39 = configuration4.screenLayout & 48;
                    if (i38 != i39) {
                        configuration.screenLayout |= i39;
                    }
                    int i40 = configuration3.screenLayout & 768;
                    int i41 = configuration4.screenLayout & 768;
                    if (i40 != i41) {
                        configuration.screenLayout |= i41;
                    }
                    if (i21 >= 26) {
                        i4 = configuration3.colorMode;
                        int i42 = i4 & 3;
                        i8 = configuration4.colorMode;
                        if (i42 != (i8 & 3)) {
                            i13 = configuration.colorMode;
                            i14 = configuration4.colorMode;
                            configuration.colorMode = i13 | (i14 & 3);
                        }
                        i9 = configuration3.colorMode;
                        int i43 = i9 & 12;
                        i10 = configuration4.colorMode;
                        if (i43 != (i10 & 12)) {
                            i11 = configuration.colorMode;
                            i12 = configuration4.colorMode;
                            configuration.colorMode = i11 | (i12 & 12);
                        }
                    }
                    int i44 = configuration3.uiMode & 15;
                    int i45 = configuration4.uiMode & 15;
                    if (i44 != i45) {
                        configuration.uiMode |= i45;
                    }
                    int i46 = configuration3.uiMode & 48;
                    int i47 = configuration4.uiMode & 48;
                    if (i46 != i47) {
                        configuration.uiMode |= i47;
                    }
                    int i48 = configuration3.screenWidthDp;
                    int i49 = configuration4.screenWidthDp;
                    if (i48 != i49) {
                        configuration.screenWidthDp = i49;
                    }
                    int i50 = configuration3.screenHeightDp;
                    int i51 = configuration4.screenHeightDp;
                    if (i50 != i51) {
                        configuration.screenHeightDp = i51;
                    }
                    int i52 = configuration3.smallestScreenWidthDp;
                    int i53 = configuration4.smallestScreenWidthDp;
                    if (i52 != i53) {
                        configuration.smallestScreenWidthDp = i53;
                    }
                    int i54 = configuration3.densityDpi;
                    int i55 = configuration4.densityDpi;
                    if (i54 != i55) {
                        configuration.densityDpi = i55;
                    }
                }
            } else {
                configuration = null;
            }
            Configuration r8 = LayoutInflaterFactory2C0860C.r(context, C8, n3, configuration, true);
            C1039b c1039b = new C1039b(context, com.buzbuz.smartautoclicker.R.style.Theme_AppCompat_Empty);
            c1039b.a(r8);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c1039b.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        G.m.a(theme);
                    } else {
                        synchronized (G.b.f1645e) {
                            if (!G.b.f1647g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    G.b.f1646f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e9) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e9);
                                }
                                G.b.f1647g = true;
                            }
                            Method method = G.b.f1646f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e10) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e10);
                                    G.b.f1646f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c1039b;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        AbstractC0862a o7 = o();
        if (getWindow().hasFeature(0)) {
            if (o7 == null || !o7.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // E.g, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0862a o7 = o();
        if (keyCode == 82 && o7 != null && o7.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0010. Please report as an issue. */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f11713y);
        printWriter.print(" mResumed=");
        printWriter.print(this.f11714z);
        printWriter.print(" mStopped=");
        printWriter.print(this.f11709A);
        if (getApplication() != null) {
            e0 f8 = f();
            o6.j.e(f8, "store");
            C0946a c0946a = C0946a.f11950b;
            o6.j.e(c0946a, "defaultCreationExtras");
            b0 b0Var = new b0(f8, C1050a.f12376c, c0946a);
            InterfaceC1642c n3 = h2.a.n(C1050a.class);
            String a3 = n3.a();
            if (a3 != null) {
                t.k kVar = ((C1050a) b0Var.l("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a3), n3)).f12377b;
                if (kVar.e() > 0) {
                    printWriter.print(str3);
                    printWriter.println("Loaders:");
                    if (kVar.e() > 0) {
                        if (kVar.f(0) == null) {
                            printWriter.print(str3);
                            printWriter.print("  #");
                            printWriter.print(kVar.c(0));
                            printWriter.print(": ");
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
            } else {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
        }
        ((C0731A) this.f11711w.f6486e).f10845l.w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i4) {
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) n();
        layoutInflaterFactory2C0860C.u();
        return layoutInflaterFactory2C0860C.f11585o.findViewById(i4);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) n();
        if (layoutInflaterFactory2C0860C.f11589s == null) {
            layoutInflaterFactory2C0860C.y();
            AbstractC0862a abstractC0862a = layoutInflaterFactory2C0860C.f11588r;
            if (abstractC0862a != null) {
                context = abstractC0862a.i();
            } else {
                context = layoutInflaterFactory2C0860C.f11584n;
            }
            layoutInflaterFactory2C0860C.f11589s = new C1044g(context);
        }
        return layoutInflaterFactory2C0860C.f11589s;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i4 = q1.f13359a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        n().b();
    }

    public final AbstractC0877p n() {
        if (this.f11710B == null) {
            ExecutorC0875n executorC0875n = AbstractC0877p.f11722d;
            this.f11710B = new LayoutInflaterFactory2C0860C(this, null, this, this);
        }
        return this.f11710B;
    }

    public final AbstractC0862a o() {
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) n();
        layoutInflaterFactory2C0860C.y();
        return layoutInflaterFactory2C0860C.f11588r;
    }

    @Override // c.l, android.app.Activity
    public final void onActivityResult(int i4, int i8, Intent intent) {
        this.f11711w.o();
        super.onActivityResult(i4, i8, intent);
    }

    @Override // c.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) n();
        if (layoutInflaterFactory2C0860C.f11558I && layoutInflaterFactory2C0860C.f11552C) {
            layoutInflaterFactory2C0860C.y();
            AbstractC0862a abstractC0862a = layoutInflaterFactory2C0860C.f11588r;
            if (abstractC0862a != null) {
                abstractC0862a.m();
            }
        }
        C1216u a3 = C1216u.a();
        Context context = layoutInflaterFactory2C0860C.f11584n;
        synchronized (a3) {
            L0 l02 = a3.f13390a;
            synchronized (l02) {
                t.g gVar = (t.g) l02.f13104b.get(context);
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        layoutInflaterFactory2C0860C.f11569U = new Configuration(layoutInflaterFactory2C0860C.f11584n.getResources().getConfiguration());
        layoutInflaterFactory2C0860C.l(false, false);
    }

    @Override // c.l, E.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11712x.d(EnumC0503n.ON_CREATE);
        T t8 = ((C0731A) this.f11711w.f6486e).f10845l;
        t8.f10892I = false;
        t8.f10893J = false;
        t8.f10898P.f10937g = false;
        t8.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0731A) this.f11711w.f6486e).f10845l.f10905f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        r();
        n().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // c.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (s(i4, menuItem)) {
            return true;
        }
        AbstractC0862a o7 = o();
        if (menuItem.getItemId() == 16908332 && o7 != null && (o7.g() & 4) != 0) {
            return w();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f11714z = false;
        ((C0731A) this.f11711w.f6486e).f10845l.u(5);
        this.f11712x.d(EnumC0503n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0860C) n()).u();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        t();
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) n();
        layoutInflaterFactory2C0860C.y();
        AbstractC0862a abstractC0862a = layoutInflaterFactory2C0860C.f11588r;
        if (abstractC0862a != null) {
            abstractC0862a.v(true);
        }
    }

    @Override // c.l, android.app.Activity
    public final void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        this.f11711w.o();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        W0.c cVar = this.f11711w;
        cVar.o();
        super.onResume();
        this.f11714z = true;
        ((C0731A) cVar.f6486e).f10845l.A(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        u();
        ((LayoutInflaterFactory2C0860C) n()).l(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f11711w.o();
    }

    @Override // android.app.Activity
    public final void onStop() {
        v();
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) n();
        layoutInflaterFactory2C0860C.y();
        AbstractC0862a abstractC0862a = layoutInflaterFactory2C0860C.f11588r;
        if (abstractC0862a != null) {
            abstractC0862a.v(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        n().k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        AbstractC0862a o7 = o();
        if (getWindow().hasFeature(0)) {
            if (o7 == null || !o7.q()) {
                super.openOptionsMenu();
            }
        }
    }

    public final T p() {
        return ((C0731A) this.f11711w.f6486e).f10845l;
    }

    public final void r() {
        super.onDestroy();
        ((C0731A) this.f11711w.f6486e).f10845l.l();
        this.f11712x.d(EnumC0503n.ON_DESTROY);
    }

    public final boolean s(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 6) {
            return ((C0731A) this.f11711w.f6486e).f10845l.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void setContentView(int i4) {
        l();
        n().h(i4);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        super.setTheme(i4);
        ((LayoutInflaterFactory2C0860C) n()).f11571W = i4;
    }

    public final void t() {
        super.onPostResume();
        this.f11712x.d(EnumC0503n.ON_RESUME);
        T t8 = ((C0731A) this.f11711w.f6486e).f10845l;
        t8.f10892I = false;
        t8.f10893J = false;
        t8.f10898P.f10937g = false;
        t8.u(7);
    }

    public final void u() {
        W0.c cVar = this.f11711w;
        cVar.o();
        C0731A c0731a = (C0731A) cVar.f6486e;
        super.onStart();
        this.f11709A = false;
        if (!this.f11713y) {
            this.f11713y = true;
            T t8 = c0731a.f10845l;
            t8.f10892I = false;
            t8.f10893J = false;
            t8.f10898P.f10937g = false;
            t8.u(4);
        }
        c0731a.f10845l.A(true);
        this.f11712x.d(EnumC0503n.ON_START);
        T t9 = c0731a.f10845l;
        t9.f10892I = false;
        t9.f10893J = false;
        t9.f10898P.f10937g = false;
        t9.u(5);
    }

    public final void v() {
        super.onStop();
        this.f11709A = true;
        do {
        } while (q(p()));
        T t8 = ((C0731A) this.f11711w.f6486e).f10845l;
        t8.f10893J = true;
        t8.f10898P.f10937g = true;
        t8.u(4);
        this.f11712x.d(EnumC0503n.ON_STOP);
    }

    public boolean w() {
        Intent b4 = E.e.b(this);
        if (b4 != null) {
            if (shouldUpRecreateTask(b4)) {
                E.v vVar = new E.v(this);
                Intent b9 = E.e.b(this);
                if (b9 == null) {
                    b9 = E.e.b(this);
                }
                if (b9 != null) {
                    ComponentName component = b9.getComponent();
                    if (component == null) {
                        component = b9.resolveActivity(vVar.f1151e.getPackageManager());
                    }
                    vVar.g(component);
                    vVar.f1150d.add(b9);
                }
                vVar.h();
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            navigateUpTo(b4);
            return true;
        }
        return false;
    }

    public final void x(Toolbar toolbar) {
        CharSequence charSequence;
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) n();
        if (!(layoutInflaterFactory2C0860C.f11583m instanceof Activity)) {
            return;
        }
        layoutInflaterFactory2C0860C.y();
        AbstractC0862a abstractC0862a = layoutInflaterFactory2C0860C.f11588r;
        if (!(abstractC0862a instanceof P)) {
            layoutInflaterFactory2C0860C.f11589s = null;
            if (abstractC0862a != null) {
                abstractC0862a.n();
            }
            layoutInflaterFactory2C0860C.f11588r = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C0860C.f11583m;
                if (obj instanceof Activity) {
                    charSequence = ((Activity) obj).getTitle();
                } else {
                    charSequence = layoutInflaterFactory2C0860C.f11590t;
                }
                K k = new K(toolbar, charSequence, layoutInflaterFactory2C0860C.f11586p);
                layoutInflaterFactory2C0860C.f11588r = k;
                layoutInflaterFactory2C0860C.f11586p.f11736e = k.f11616d;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C0860C.f11586p.f11736e = null;
            }
            layoutInflaterFactory2C0860C.b();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // c.l, android.app.Activity
    public void setContentView(View view) {
        l();
        n().i(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        n().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0731A) this.f11711w.f6486e).f10845l.f10905f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
