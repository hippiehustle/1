package E2;

import C6.InterfaceC0002c;
import C6.O;
import D2.g;
import D2.i;
import D2.k;
import I7.m;
import I7.v;
import J7.f;
import L7.AbstractC0160s;
import N7.h;
import N7.l;
import N7.q;
import P.T;
import P.V;
import P6.AbstractC0283f;
import Y6.o;
import a.AbstractC0405a;
import a6.AbstractC0425A;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a7.EnumC0449j;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import b6.C0535c;
import c0.t;
import c0.u;
import c7.C0587f;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import d6.C0618d;
import d6.C0623i;
import d6.InterfaceC0617c;
import d6.InterfaceC0619e;
import d6.InterfaceC0622h;
import f6.AbstractC0713c;
import f6.AbstractC0718h;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import g1.C0758B;
import g1.C0759C;
import g1.C0760D;
import g1.C0761E;
import g1.C0762F;
import g1.C0763G;
import g1.C0764H;
import g1.C0765I;
import g1.C0766J;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import m7.AbstractC1098d;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import n7.C1169b;
import o.C1178a0;
import o.p1;
import o6.j;
import o6.y;
import q4.X;

/* loaded from: classes.dex */
public abstract class c implements V, Y7.b, Y7.a {

    /* renamed from: a, reason: collision with root package name */
    public static long f1180a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f1181b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1182c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1183d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f1184e = 0;

    public static final void A0(A4.c cVar, String str) {
        j.e(cVar, "<this>");
        j.e(str, "titleText");
        A4.c cVar2 = (A4.c) cVar.f293g;
        j.d(cVar2, "titleAndDescription");
        X.W(cVar2, str);
    }

    public static final void B0(A4.a aVar, B2.e eVar) {
        MaterialButton materialButton = (MaterialButton) aVar.f283h;
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) aVar.f280e;
        j.e(eVar, "state");
        List list = eVar.f449a;
        int size = list.size();
        if (2 <= size && size < 4) {
            ((MaterialButton) aVar.f281f).setIcon(materialButtonToggleGroup.getContext().getDrawable(((Number) list.get(0)).intValue()));
            ((MaterialButton) aVar.f282g).setIcon(materialButtonToggleGroup.getContext().getDrawable(((Number) list.get(1)).intValue()));
            if (list.size() > 2) {
                materialButton.setIcon(materialButtonToggleGroup.getContext().getDrawable(((Number) list.get(2)).intValue()));
                materialButton.setVisibility(0);
            } else {
                materialButton.setVisibility(8);
            }
            materialButtonToggleGroup.setSingleSelection(true);
            materialButtonToggleGroup.setSelectionRequired(eVar.f450b);
            return;
        }
        throw new IllegalArgumentException("Button should have 2 or 3 entries");
    }

    public static final long C0(Long l6, k kVar) {
        long longValue;
        long c6;
        j.e(kVar, "unit");
        if (l6 == null) {
            return -1L;
        }
        if (kVar.equals(D2.j.f880c)) {
            longValue = l6.longValue();
            int i4 = J7.a.f2503g;
            c6 = J7.a.c(f.l(1, J7.c.SECONDS));
        } else if (kVar.equals(i.f879c)) {
            longValue = l6.longValue();
            int i8 = J7.a.f2503g;
            c6 = J7.a.c(f.l(1, J7.c.MINUTES));
        } else if (kVar.equals(g.f877c)) {
            longValue = l6.longValue();
            int i9 = J7.a.f2503g;
            c6 = J7.a.c(f.l(1, J7.c.HOURS));
        } else {
            return l6.longValue();
        }
        return c6 * longValue;
    }

    public static C0722b D0(C0723c c0723c) {
        j.e(c0723c, "topLevelFqName");
        return new C0722b(c0723c.b(), c0723c.f10797a.f());
    }

    public static ActionMode.Callback F0(ActionMode.Callback callback) {
        if ((callback instanceof S.i) && Build.VERSION.SDK_INT >= 26) {
            return ((S.i) callback).f5169a;
        }
        return callback;
    }

    public static final void G0(p1 p1Var, Collection collection) {
        j.e(p1Var, "<this>");
        LinearLayout linearLayout = (LinearLayout) p1Var.f13350f;
        RecyclerView recyclerView = (RecyclerView) p1Var.j;
        ProgressBar progressBar = (ProgressBar) p1Var.k;
        if (collection == null) {
            progressBar.setVisibility(0);
            recyclerView.setVisibility(8);
            linearLayout.setVisibility(8);
        } else if (collection.isEmpty()) {
            progressBar.setVisibility(8);
            recyclerView.setVisibility(8);
            linearLayout.setVisibility(0);
        } else {
            progressBar.setVisibility(8);
            recyclerView.setVisibility(0);
            linearLayout.setVisibility(8);
        }
    }

    public static h H(int i4, int i8, N7.a aVar) {
        int i9 = i8 & 2;
        N7.a aVar2 = N7.a.f3795d;
        if (i9 != 0) {
            aVar = aVar2;
        }
        if (i4 != -2) {
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != Integer.MAX_VALUE) {
                        if (aVar == aVar2) {
                            return new h(i4);
                        }
                        return new q(i4, aVar);
                    }
                    return new h(Integer.MAX_VALUE);
                }
                if (aVar == aVar2) {
                    return new h(0);
                }
                return new q(1, aVar);
            }
            if (aVar == aVar2) {
                return new q(1, N7.a.f3796e);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (aVar == aVar2) {
            l.f3838b.getClass();
            return new h(N7.k.f3837b);
        }
        return new q(1, aVar);
    }

    public static ActionMode.Callback H0(ActionMode.Callback callback, TextView textView) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && i4 <= 27 && !(callback instanceof S.i) && callback != null) {
            return new S.i(callback, textView);
        }
        return callback;
    }

    public static void I(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static Object I0(InterfaceC1164c interfaceC1164c, Object obj, InterfaceC0617c interfaceC0617c) {
        Object abstractC0713c;
        j.e(interfaceC1164c, "<this>");
        InterfaceC0622h h8 = interfaceC0617c.h();
        if (h8 == C0623i.f10448d) {
            abstractC0713c = new AbstractC0718h(interfaceC0617c);
        } else {
            abstractC0713c = new AbstractC0713c(interfaceC0617c, h8);
        }
        y.c(2, interfaceC1164c);
        return interfaceC1164c.l(obj, abstractC0713c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d6.c, java.lang.Object, H7.l] */
    public static final void J(View view) {
        j.e(view, "<this>");
        ?? obj = new Object();
        T t8 = new T(view, obj);
        t8.f4226g = obj;
        obj.f2072g = t8;
        while (obj.hasNext()) {
            View view2 = (View) obj.next();
            U.a aVar = (U.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new U.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f5937a;
            int W7 = AbstractC0437l.W(arrayList);
            if (-1 < W7) {
                arrayList.get(W7).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static void M(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int N(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void O(int i4, int i8) {
        if (i4 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i8 + ").");
    }

    public static boolean P(File file, Resources resources, int i4) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i4);
            try {
                boolean Q5 = Q(file, inputStream);
                M(inputStream);
                return Q5;
            } catch (Throwable th) {
                th = th;
                M(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean Q(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e9) {
                e = e9;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    M(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            M(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            M(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c0.u, c0.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u R(Context context) {
        G5.e eVar;
        ProviderInfo providerInfo;
        M.d dVar;
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT >= 28) {
            eVar = new G5.e(16);
        } else {
            eVar = new G5.e(16);
        }
        PackageManager packageManager = context.getPackageManager();
        AbstractC0405a.l(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (it.hasNext()) {
                providerInfo = it.next().providerInfo;
                if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                    break;
                }
            } else {
                providerInfo = null;
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] t8 = eVar.t(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : t8) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new M.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e9) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e9);
            }
            if (dVar != null) {
                return null;
            }
            return new c0.g(new t(context, dVar));
        }
        dVar = null;
        if (dVar != null) {
        }
    }

    public static final k T(Long l6) {
        if (l6 != null && l6.longValue() > 0) {
            long longValue = l6.longValue();
            int i4 = J7.a.f2503g;
            if (longValue % J7.a.c(f.l(1, J7.c.HOURS)) == 0) {
                return g.f877c;
            }
            if (l6.longValue() % J7.a.c(f.l(1, J7.c.MINUTES)) == 0) {
                return i.f879c;
            }
            if (l6.longValue() % J7.a.c(f.l(1, J7.c.SECONDS)) == 0) {
                return D2.j.f880c;
            }
            return D2.h.f878c;
        }
        return D2.h.f878c;
    }

    public static final String U(k kVar, long j) {
        j.e(kVar, "<this>");
        if (kVar.equals(D2.j.f880c)) {
            int i4 = J7.a.f2503g;
            j /= J7.a.c(f.l(1, J7.c.SECONDS));
        } else if (kVar.equals(i.f879c)) {
            int i8 = J7.a.f2503g;
            j /= J7.a.c(f.l(1, J7.c.MINUTES));
        } else if (kVar.equals(g.f877c)) {
            int i9 = J7.a.f2503g;
            j /= J7.a.c(f.l(1, J7.c.HOURS));
        }
        return String.valueOf(j);
    }

    public static C0722b V(String str, boolean z8) {
        String Z8;
        j.e(str, "string");
        int h02 = m.h0(str, '`', 0, 6);
        if (h02 == -1) {
            h02 = str.length();
        }
        int l02 = m.l0(h02, 4, str, "/");
        String str2 = "";
        if (l02 == -1) {
            Z8 = v.Z(str, "`", "");
        } else {
            String substring = str.substring(0, l02);
            j.d(substring, "substring(...)");
            String Y = v.Y(substring, '/', '.');
            String substring2 = str.substring(l02 + 1);
            j.d(substring2, "substring(...)");
            Z8 = v.Z(substring2, "`", "");
            str2 = Y;
        }
        return new C0722b(new C0723c(str2), new C0723c(Z8), z8);
    }

    public static final C0535c W() {
        C0535c i4 = d.i();
        i4.add(C0758B.k);
        i4.add(C0759C.k);
        i4.add(C0760D.k);
        i4.add(C0761E.k);
        i4.add(C0762F.k);
        i4.add(C0763G.k);
        i4.add(C0764H.k);
        i4.add(C0765I.k);
        if (Build.VERSION.SDK_INT >= 29) {
            i4.add(C0766J.k);
        }
        return d.f(i4);
    }

    public static H6.b X(s7.v vVar, boolean z8, boolean z9, Boolean bool, boolean z10, W0.c cVar, C0587f c0587f) {
        s7.t tVar;
        EnumC0449j enumC0449j;
        o oVar;
        Y6.g gVar;
        C1169b c1169b;
        j.e(vVar, "container");
        O o7 = vVar.f14630c;
        j.e(c0587f, "metadataVersion");
        EnumC0449j enumC0449j2 = EnumC0449j.INTERFACE;
        if (z8) {
            if (bool != null) {
                if (vVar instanceof s7.t) {
                    s7.t tVar2 = (s7.t) vVar;
                    if (tVar2.f14625g == enumC0449j2) {
                        return X.t(cVar, tVar2.f14624f.d(C0725e.e("DefaultImpls")), c0587f);
                    }
                }
                if (bool.booleanValue() && (vVar instanceof s7.u)) {
                    if (o7 instanceof Y6.g) {
                        gVar = (Y6.g) o7;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        c1169b = gVar.f7223e;
                    } else {
                        c1169b = null;
                    }
                    if (c1169b != null) {
                        String d2 = c1169b.d();
                        j.d(d2, "getInternalName(...)");
                        C0723c c0723c = new C0723c(v.Y(d2, '/', '.'));
                        return X.t(cVar, new C0722b(c0723c.b(), c0723c.f10797a.f()), c0587f);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + vVar + ')').toString());
            }
        }
        if (z9 && (vVar instanceof s7.t)) {
            s7.t tVar3 = (s7.t) vVar;
            if (tVar3.f14625g == EnumC0449j.COMPANION_OBJECT && (tVar = tVar3.f14623e) != null && ((enumC0449j = tVar.f14625g) == EnumC0449j.CLASS || enumC0449j == EnumC0449j.ENUM_CLASS || (z10 && (enumC0449j == enumC0449j2 || enumC0449j == EnumC0449j.ANNOTATION_CLASS)))) {
                O o8 = tVar.f14630c;
                if (o8 instanceof o) {
                    oVar = (o) o8;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    return oVar.f7236d;
                }
                return null;
            }
        }
        if ((vVar instanceof s7.u) && (o7 instanceof Y6.g)) {
            j.c(o7, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            Y6.g gVar2 = (Y6.g) o7;
            H6.b bVar = gVar2.f7224f;
            if (bVar == null) {
                return X.t(cVar, gVar2.b(), c0587f);
            }
            return bVar;
        }
        return null;
    }

    public static File Y(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i4 = 0; i4 < 100; i4++) {
            File file = new File(cacheDir, str + i4);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static N.c Z(C1178a0 c1178a0) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new N.c(I.a.i(c1178a0));
        }
        TextPaint textPaint = new TextPaint(c1178a0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c1178a0.getBreakStrategy();
        int hyphenationFrequency = c1178a0.getHyphenationFrequency();
        if (c1178a0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z8 = true;
            if (i4 >= 28 && (c1178a0.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(I.a.a(DecimalFormatSymbols.getInstance(c1178a0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                if (c1178a0.getLayoutDirection() != 1) {
                    z8 = false;
                }
                switch (c1178a0.getTextDirection()) {
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        break;
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z8) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            }
        }
        return new N.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean c0(InterfaceC0002c interfaceC0002c) {
        j.e(interfaceC0002c, "callableMemberDescriptor");
        if (AbstractC0283f.f4563d.contains(interfaceC0002c.getName())) {
            if (!AbstractC0436k.l0(AbstractC0283f.f4562c, AbstractC1098d.c(interfaceC0002c)) || !interfaceC0002c.z0().isEmpty()) {
                if (z6.h.A(interfaceC0002c)) {
                    Collection<InterfaceC0002c> s8 = interfaceC0002c.s();
                    j.d(s8, "getOverriddenDescriptors(...)");
                    if (!s8.isEmpty()) {
                        for (InterfaceC0002c interfaceC0002c2 : s8) {
                            j.b(interfaceC0002c2);
                            if (c0(interfaceC0002c2)) {
                                return true;
                            }
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static InterfaceC0617c d0(InterfaceC0617c interfaceC0617c) {
        AbstractC0713c abstractC0713c;
        InterfaceC0617c interfaceC0617c2;
        j.e(interfaceC0617c, "<this>");
        if (interfaceC0617c instanceof AbstractC0713c) {
            abstractC0713c = (AbstractC0713c) interfaceC0617c;
        } else {
            abstractC0713c = null;
        }
        if (abstractC0713c != null && (interfaceC0617c = abstractC0713c.f10783f) == null) {
            InterfaceC0619e interfaceC0619e = (InterfaceC0619e) abstractC0713c.h().B(C0618d.f10447d);
            if (interfaceC0619e != null) {
                interfaceC0617c2 = new Q7.f((AbstractC0160s) interfaceC0619e, abstractC0713c);
            } else {
                interfaceC0617c2 = abstractC0713c;
            }
            abstractC0713c.f10783f = interfaceC0617c2;
            return interfaceC0617c2;
        }
        return interfaceC0617c;
    }

    public static boolean e0() {
        if (Build.VERSION.SDK_INT >= 29) {
            return I0.a.a();
        }
        try {
            if (f1181b == null) {
                f1180a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1181b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1181b.invoke(null, Long.valueOf(f1180a))).booleanValue();
        } catch (Exception e9) {
            if (e9 instanceof InvocationTargetException) {
                Throwable cause = e9.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            return false;
        }
    }

    public static boolean f0(byte b4) {
        if (b4 > -65) {
            return true;
        }
        return false;
    }

    public static MappedByteBuffer g0(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static K2.h h0(float... fArr) {
        K2.h hVar = new K2.h();
        hVar.setFloatValues(Arrays.copyOf(fArr, fArr.length));
        return hVar;
    }

    public static final Object m0(Set set, Enum r22, Enum r32, Enum r42, boolean z8) {
        Enum r12;
        if (z8) {
            if (set.contains(r22)) {
                r12 = r22;
            } else if (set.contains(r32)) {
                r12 = r32;
            } else {
                r12 = null;
            }
            if (j.a(r12, r22) && j.a(r42, r32)) {
                return null;
            }
            if (r42 == null) {
                return r12;
            }
            return r42;
        }
        if (r42 != null) {
            set = AbstractC0436k.V0(AbstractC0425A.h0(set, r42));
        }
        return AbstractC0436k.H0(set);
    }

    public static final void n0(A4.a aVar, Integer num) {
        Integer num2;
        j.e(aVar, "<this>");
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) aVar.f280e;
        if (num != null && num.intValue() == 0) {
            num2 = Integer.valueOf(((MaterialButton) aVar.f281f).getId());
        } else if (num != null && num.intValue() == 1) {
            num2 = Integer.valueOf(((MaterialButton) aVar.f282g).getId());
        } else if (num != null && num.intValue() == 2) {
            num2 = Integer.valueOf(((MaterialButton) aVar.f283h).getId());
        } else {
            num2 = null;
        }
        int checkedButtonId = materialButtonToggleGroup.getCheckedButtonId();
        if (num != null && num.intValue() == checkedButtonId) {
            return;
        }
        if (num2 == null) {
            materialButtonToggleGroup.d(new HashSet());
        } else {
            materialButtonToggleGroup.b(num2.intValue(), true);
        }
    }

    public static final void o0(A4.c cVar, String str) {
        j.e(cVar, "<this>");
        z0((MaterialTextView) ((A4.c) cVar.f293g).f292f, str);
    }

    public static final void p0(p1 p1Var, int i4, Integer num) {
        LinearLayout linearLayout = (LinearLayout) p1Var.f13351g;
        ((MaterialTextView) p1Var.f13353i).setText(i4);
        if (num == null) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            ((MaterialTextView) p1Var.f13352h).setText(num.intValue());
        }
    }

    public static final void q0(A4.c cVar, boolean z8) {
        float f8;
        j.e(cVar, "<this>");
        ConstraintLayout constraintLayout = (ConstraintLayout) cVar.f291e;
        constraintLayout.setEnabled(z8);
        if (z8) {
            f8 = 1.0f;
        } else {
            f8 = 0.5f;
        }
        constraintLayout.setAlpha(f8);
    }

    public static final void r0(A.i iVar, boolean z8) {
        String str;
        j.e(iVar, "<this>");
        TextInputLayout textInputLayout = (TextInputLayout) iVar.f88e;
        if (z8) {
            str = textInputLayout.getContext().getString(R.string.input_field_error_required);
        } else {
            str = null;
        }
        textInputLayout.setError(str);
    }

    public static void s0(TextView textView, int i4) {
        int i8;
        AbstractC0405a.j(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            I.a.l(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i8 = fontMetricsInt.top;
        } else {
            i8 = fontMetricsInt.ascent;
        }
        if (i4 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void t0(TextView textView, int i4) {
        int i8;
        AbstractC0405a.j(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i8 = fontMetricsInt.bottom;
        } else {
            i8 = fontMetricsInt.descent;
        }
        if (i4 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i8);
        }
    }

    public static void u0(TextView textView, int i4) {
        AbstractC0405a.j(i4);
        if (i4 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public static final void v0(A4.a aVar, InterfaceC1163b interfaceC1163b) {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) aVar.f280e;
        LinkedHashSet linkedHashSet = materialButtonToggleGroup.f10006f;
        Object tag = materialButtonToggleGroup.getTag();
        if (tag instanceof m5.f) {
            linkedHashSet.remove((m5.f) tag);
        }
        if (interfaceC1163b == null) {
            return;
        }
        B2.a aVar2 = new B2.a(interfaceC1163b, aVar, 1);
        linkedHashSet.add(aVar2);
        materialButtonToggleGroup.setTag(aVar2);
    }

    public static final void w0(A4.c cVar, InterfaceC1162a interfaceC1162a) {
        j.e(cVar, "<this>");
        ((ConstraintLayout) cVar.f291e).setOnClickListener(new a(0, interfaceC1162a));
    }

    public static final void x0(A.i iVar, InterfaceC1163b interfaceC1163b) {
        ((TextInputEditText) iVar.f89f).addTextChangedListener(new C2.b(1, interfaceC1163b));
    }

    public static final void y0(A.i iVar, String str, int i4) {
        j.e(iVar, "<this>");
        TextInputEditText textInputEditText = (TextInputEditText) iVar.f89f;
        textInputEditText.setInputType(i4);
        textInputEditText.setImeOptions(6);
        textInputEditText.setText(str);
    }

    public static final void z0(TextView textView, String str) {
        int i4;
        j.e(textView, "<this>");
        if (str == null) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        textView.setVisibility(i4);
        textView.setText(str);
    }

    @Override // Y7.b
    public String A() {
        S();
        throw null;
    }

    @Override // Y7.a
    public String B(X7.f fVar, int i4) {
        j.e(fVar, "descriptor");
        return A();
    }

    @Override // Y7.b
    public float C() {
        S();
        throw null;
    }

    @Override // Y7.a
    public byte D(Z7.V v8, int i4) {
        j.e(v8, "descriptor");
        return x();
    }

    @Override // Y7.b
    public double E() {
        S();
        throw null;
    }

    public abstract boolean E0(View view, int i4);

    @Override // Y7.a
    public Y7.b G(Z7.V v8, int i4) {
        j.e(v8, "descriptor");
        return r(v8.j(i4));
    }

    public abstract int K(View view, int i4);

    public abstract int L(View view, int i4);

    public void S() {
        throw new IllegalArgumentException(o6.v.f13643a.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // Y7.b
    public abstract long a();

    public int a0(View view) {
        return 0;
    }

    @Override // Y7.a
    public double b(Z7.V v8, int i4) {
        j.e(v8, "descriptor");
        return E();
    }

    public int b0() {
        return 0;
    }

    @Override // Y7.b
    public boolean e() {
        S();
        throw null;
    }

    @Override // Y7.b
    public boolean f() {
        return true;
    }

    @Override // Y7.a
    public void g(X7.f fVar) {
        j.e(fVar, "descriptor");
    }

    @Override // Y7.b
    public char h() {
        S();
        throw null;
    }

    @Override // Y7.a
    public long i(X7.f fVar, int i4) {
        j.e(fVar, "descriptor");
        return a();
    }

    @Override // Y7.b
    public Y7.a j(X7.f fVar) {
        j.e(fVar, "descriptor");
        return this;
    }

    public abstract void j0(int i4);

    @Override // Y7.a
    public boolean k(X7.f fVar, int i4) {
        j.e(fVar, "descriptor");
        return e();
    }

    public abstract void k0(View view, int i4, int i8);

    @Override // Y7.a
    public short l(Z7.V v8, int i4) {
        j.e(v8, "descriptor");
        return z();
    }

    public abstract void l0(View view, float f8, float f9);

    @Override // Y7.b
    public int m(X7.f fVar) {
        j.e(fVar, "enumDescriptor");
        S();
        throw null;
    }

    @Override // Y7.a
    public int o(X7.f fVar, int i4) {
        j.e(fVar, "descriptor");
        return t();
    }

    @Override // Y7.a
    public Object p(X7.f fVar, int i4, V7.a aVar, Object obj) {
        j.e(fVar, "descriptor");
        j.e(aVar, "deserializer");
        return u(aVar);
    }

    @Override // Y7.a
    public char q(Z7.V v8, int i4) {
        j.e(v8, "descriptor");
        return h();
    }

    @Override // Y7.b
    public Y7.b r(X7.f fVar) {
        j.e(fVar, "descriptor");
        return this;
    }

    @Override // Y7.b
    public abstract int t();

    @Override // Y7.b
    public Object u(V7.a aVar) {
        j.e(aVar, "deserializer");
        return aVar.a(this);
    }

    @Override // Y7.a
    public float w(Z7.V v8, int i4) {
        j.e(v8, "descriptor");
        return C();
    }

    @Override // Y7.b
    public abstract byte x();

    @Override // Y7.a
    public Object y(X7.f fVar, int i4, V7.a aVar, Object obj) {
        j.e(fVar, "descriptor");
        j.e(aVar, "deserializer");
        if (!aVar.d().h() && !f()) {
            return null;
        }
        return u(aVar);
    }

    @Override // Y7.b
    public abstract short z();

    @Override // P.V
    public void F() {
    }

    @Override // P.V
    public void d() {
    }

    public void i0(View view, int i4) {
    }
}
