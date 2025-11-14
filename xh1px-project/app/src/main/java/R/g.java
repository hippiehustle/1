package R;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.T;
import D4.C0027c;
import G.n;
import I6.B;
import I6.C;
import I6.E;
import I6.q;
import I7.o;
import L7.F;
import M3.V;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import O7.i0;
import Q4.m;
import Q7.t;
import Z3.N;
import Z5.j;
import a.AbstractC0405a;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import android.animation.ValueAnimator;
import android.content.ClipDescription;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import b0.ChoreographerFrameCallbackC0516a;
import b6.C0538f;
import c0.r;
import c0.v;
import c0.y;
import c0.z;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.core.ui.views.itembrief.ItemBriefView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import d0.C0592a;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import f7.C0722b;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import g0.L;
import g0.b0;
import h1.C0808a;
import h1.C0809b;
import h4.AbstractC0832f;
import i7.AbstractC0890e;
import j2.AbstractC0901a;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k2.AbstractC0951a;
import l1.C0999a;
import m1.InterfaceC1052b;
import m1.InterfaceC1053c;
import m7.AbstractC1098d;
import n0.AbstractC1129g;
import n1.AbstractC1149a;
import n1.AbstractC1151c;
import n1.C1152d;
import n1.i;
import n1.k;
import n6.InterfaceC1164c;
import n6.InterfaceC1167f;
import n7.EnumC1170c;
import o.C1216u;
import o.S;
import o6.s;
import p7.InterfaceC1333o;
import s3.AbstractC1492c;
import t0.C1536c;
import t2.C1562a;
import t4.x;
import t6.C1588c;
import t7.C1594d;
import u6.InterfaceC1642c;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.C1761x;
import w7.G;
import w7.J;
import w7.M;
import w7.U;
import w7.W;
import w7.X;
import y7.l;
import z.C1845b;
import z5.InterfaceC1871b;

/* loaded from: classes.dex */
public final class g implements h, InterfaceC0233f, M0.a, Z5.g {

    /* renamed from: h, reason: collision with root package name */
    public static g f4985h;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4986d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4987e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4988f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4989g;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i4) {
        this.f4986d = i4;
        this.f4987e = obj;
        this.f4988f = obj2;
        this.f4989g = obj3;
    }

    public static g J(Context context, AttributeSet attributeSet, int[] iArr, int i4) {
        return new g(context, context.obtainStyledAttributes(attributeSet, iArr, i4, 0));
    }

    public static g j(View view) {
        int i4 = R.id.image_scenario_type;
        AppCompatImageView appCompatImageView = (AppCompatImageView) E2.b.r(view, R.id.image_scenario_type);
        if (appCompatImageView != null) {
            i4 = R.id.title_scenario_type;
            MaterialTextView materialTextView = (MaterialTextView) E2.b.r(view, R.id.title_scenario_type);
            if (materialTextView != null) {
                return new g((MaterialCardView) view, appCompatImageView, materialTextView, 3);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static boolean p(Editable editable, KeyEvent keyEvent, boolean z8) {
        z[] zVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (zVarArr = (z[]) editable.getSpans(selectionStart, selectionEnd, z.class)) != null && zVarArr.length > 0) {
                for (z zVar : zVarArr) {
                    int spanStart = editable.getSpanStart(zVar);
                    int spanEnd = editable.getSpanEnd(zVar);
                    if ((z8 && spanStart == selectionStart) || ((!z8 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Drawable A(int i4) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f4988f;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0) {
            return h4.g.k((Context) this.f4987e, resourceId);
        }
        return typedArray.getDrawable(i4);
    }

    public Drawable B(int i4) {
        int resourceId;
        Drawable d2;
        if (((TypedArray) this.f4988f).hasValue(i4) && (resourceId = ((TypedArray) this.f4988f).getResourceId(i4, 0)) != 0) {
            C1216u a3 = C1216u.a();
            Context context = (Context) this.f4987e;
            synchronized (a3) {
                d2 = a3.f13390a.d(context, resourceId, true);
            }
            return d2;
        }
        return null;
    }

    public long C(C0999a c0999a) {
        if (c0999a != null && c0999a.f12188b == null) {
            long j = c0999a.f12187a;
            if (j != 0) {
                return j;
            }
        }
        if (c0999a != null) {
            Long l6 = (Long) ((LinkedHashMap) this.f4987e).get(c0999a.f12188b);
            if (l6 != null) {
                return l6.longValue();
            }
            throw new IllegalStateException("Identifier is not found in event map for " + c0999a);
        }
        throw new IllegalStateException("Event database id can't be found");
    }

    public Typeface D(int i4, int i8, S s8) {
        int resourceId = ((TypedArray) this.f4988f).getResourceId(i4, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f4989g) == null) {
                this.f4989g = new TypedValue();
            }
            Context context = (Context) this.f4987e;
            TypedValue typedValue = (TypedValue) this.f4989g;
            ThreadLocal threadLocal = n.f1676a;
            if (context.isRestricted()) {
                return null;
            }
            return n.b(context, resourceId, typedValue, i8, s8, true, false);
        }
        return null;
    }

    public boolean E(CharSequence charSequence, int i4, int i8, y yVar) {
        int i9;
        if ((yVar.f9427c & 3) == 0) {
            c0.h hVar = (c0.h) this.f4989g;
            C0592a b4 = yVar.b();
            int b9 = b4.b(8);
            if (b9 != 0) {
                ((ByteBuffer) b4.f4206g).getShort(b9 + b4.f4203d);
            }
            c0.d dVar = (c0.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = c0.d.f9376b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i4 < i8) {
                sb.append(charSequence.charAt(i4));
                i4++;
            }
            TextPaint textPaint = dVar.f9377a;
            String sb2 = sb.toString();
            int i10 = H.d.f1852a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i11 = yVar.f9427c & 4;
            if (hasGlyph) {
                i9 = i11 | 2;
            } else {
                i9 = i11 | 1;
            }
            yVar.f9427c = i9;
        }
        if ((yVar.f9427c & 3) != 2) {
            return false;
        }
        return true;
    }

    public void F(String str, String str2, j... jVarArr) {
        o6.j.e(str, "fromTableName");
        o6.j.e(jVarArr, "columnsToFromColumns");
        String str3 = (String) this.f4989g;
        ArrayList arrayList = new ArrayList(jVarArr.length);
        for (j jVar : jVarArr) {
            arrayList.add((String) jVar.f7485d);
        }
        String l6 = AbstractC0832f.l(arrayList);
        ArrayList arrayList2 = new ArrayList(jVarArr.length);
        for (j jVar2 : jVarArr) {
            arrayList2.add((String) jVar2.f7486e);
        }
        String l8 = AbstractC0832f.l(arrayList2);
        if (str2 == null || str2.length() == 0) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder("\n            INSERT INTO `");
        sb.append(str3);
        sb.append("` (");
        sb.append(l6);
        sb.append(")\n            SELECT ");
        AbstractC1149a.m(sb, l8, "\n            FROM `", str, "`\n            ");
        sb.append(str2);
        sb.append("\n        ");
        v(o.Q(sb.toString()));
    }

    public long G(ContentValues contentValues) {
        Objects.toString(contentValues);
        return ((E0.a) this.f4987e).x((String) this.f4989g, contentValues);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (L7.AbstractC0166y.A(r11, r0, r7) != r10) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, o6.s] */
    /* JADX WARN: Type inference failed for: r4v7, types: [f6.j, n6.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H(Uri uri, Point point, A4.a aVar, AbstractC0713c abstractC0713c) {
        V2.c cVar;
        int i4;
        Uri uri2;
        Point point2;
        s sVar;
        A4.a aVar2;
        if (abstractC0713c instanceof V2.c) {
            cVar = (V2.c) abstractC0713c;
            int i8 = cVar.f6343m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f6343m = i8 - Integer.MIN_VALUE;
                V2.c cVar2 = cVar;
                Object obj = cVar2.k;
                i4 = cVar2.f6343m;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj);
                            return Z5.y.f7506a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s sVar2 = cVar2.j;
                    A4.a aVar3 = cVar2.f6341i;
                    point2 = cVar2.f6340h;
                    Uri uri3 = cVar2.f6339g;
                    Z5.a.d(obj);
                    aVar2 = aVar3;
                    uri2 = uri3;
                    sVar = sVar2;
                } else {
                    Z5.a.d(obj);
                    Log.i("BackupEngine", "Load backup: " + uri);
                    ((X2.a) this.f4988f).j();
                    ((Z2.d) this.f4989g).j();
                    ?? obj2 = new Object();
                    ?? r42 = (AbstractC0720j) aVar.f280e;
                    Integer num = new Integer(obj2.f13640d);
                    cVar2.f6339g = uri;
                    cVar2.f6340h = point;
                    cVar2.f6341i = aVar;
                    cVar2.j = obj2;
                    cVar2.f6343m = 1;
                    if (r42.j(num, null, cVar2) != enumC0646a) {
                        uri2 = uri;
                        point2 = point;
                        sVar = obj2;
                        aVar2 = aVar;
                    }
                    return enumC0646a;
                }
                S7.e eVar = F.f3175a;
                S7.d dVar = S7.d.f5456f;
                V2.d dVar2 = new V2.d(this, uri2, aVar2, point2, sVar, null);
                cVar2.f6339g = null;
                cVar2.f6340h = null;
                cVar2.f6341i = null;
                cVar2.j = null;
                cVar2.f6343m = 2;
            }
        }
        cVar = new V2.c(this, abstractC0713c);
        V2.c cVar22 = cVar;
        Object obj3 = cVar22.k;
        i4 = cVar22.f6343m;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        S7.e eVar2 = F.f3175a;
        S7.d dVar3 = S7.d.f5456f;
        V2.d dVar22 = new V2.d(this, uri2, aVar2, point2, sVar, null);
        cVar22.f6339g = null;
        cVar22.f6340h = null;
        cVar22.f6341i = null;
        cVar22.j = null;
        cVar22.f6343m = 2;
    }

    public boolean I(A.f fVar, y.d dVar, boolean z8) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        C1845b c1845b = (C1845b) this.f4988f;
        int[] iArr = dVar.f16362c0;
        int[] iArr2 = dVar.f16369l;
        c1845b.f16573a = iArr[0];
        boolean z13 = true;
        c1845b.f16574b = iArr[1];
        c1845b.f16575c = dVar.l();
        c1845b.f16576d = dVar.i();
        c1845b.f16581i = false;
        c1845b.j = z8;
        if (c1845b.f16573a == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (c1845b.f16574b == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && dVar.f16343L > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && dVar.f16343L > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && iArr2[0] == 4) {
            c1845b.f16573a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            c1845b.f16574b = 1;
        }
        fVar.a(dVar, c1845b);
        dVar.y(c1845b.f16577e);
        dVar.v(c1845b.f16578f);
        dVar.f16380w = c1845b.f16580h;
        int i4 = c1845b.f16579g;
        dVar.f16347P = i4;
        if (i4 <= 0) {
            z13 = false;
        }
        dVar.f16380w = z13;
        c1845b.j = false;
        return c1845b.f16581i;
    }

    public Object K(CharSequence charSequence, int i4, int i8, int i9, boolean z8, r rVar) {
        int i10;
        v vVar;
        char c6;
        c0.s sVar = new c0.s((v) ((A4.a) this.f4988f).f282g);
        int codePointAt = Character.codePointAt(charSequence, i4);
        int i11 = 0;
        boolean z9 = true;
        int i12 = i4;
        loop0: while (true) {
            i10 = i12;
            while (i12 < i8 && i11 < i9 && z9) {
                SparseArray sparseArray = sVar.f9405c.f9418a;
                if (sparseArray == null) {
                    vVar = null;
                } else {
                    vVar = (v) sparseArray.get(codePointAt);
                }
                if (sVar.f9403a != 2) {
                    if (vVar == null) {
                        sVar.a();
                        c6 = 1;
                    } else {
                        sVar.f9403a = 2;
                        sVar.f9405c = vVar;
                        sVar.f9408f = 1;
                        c6 = 2;
                    }
                } else {
                    if (vVar != null) {
                        sVar.f9405c = vVar;
                        sVar.f9408f++;
                    } else {
                        if (codePointAt == 65038) {
                            sVar.a();
                        } else if (codePointAt != 65039) {
                            v vVar2 = sVar.f9405c;
                            if (vVar2.f9419b != null) {
                                if (sVar.f9408f == 1) {
                                    if (sVar.b()) {
                                        sVar.f9406d = sVar.f9405c;
                                        sVar.a();
                                    } else {
                                        sVar.a();
                                    }
                                } else {
                                    sVar.f9406d = vVar2;
                                    sVar.a();
                                }
                                c6 = 3;
                            } else {
                                sVar.a();
                            }
                        }
                        c6 = 1;
                    }
                    c6 = 2;
                }
                sVar.f9407e = codePointAt;
                if (c6 != 1) {
                    if (c6 != 2) {
                        if (c6 == 3) {
                            if (z8 || !E(charSequence, i10, i12, sVar.f9406d.f9419b)) {
                                z9 = rVar.i(charSequence, i10, i12, sVar.f9406d.f9419b);
                                i11++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i12;
                        if (charCount < i8) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i12 = charCount;
                    }
                } else {
                    i12 = Character.charCount(Character.codePointAt(charSequence, i10)) + i10;
                    if (i12 < i8) {
                        codePointAt = Character.codePointAt(charSequence, i12);
                    }
                }
            }
        }
        if (sVar.f9403a == 2 && sVar.f9405c.f9419b != null && ((sVar.f9408f > 1 || sVar.b()) && i11 < i9 && z9 && (z8 || !E(charSequence, i10, i12, sVar.f9405c.f9419b)))) {
            rVar.i(charSequence, i10, i12, sVar.f9405c.f9419b);
        }
        return rVar.a();
    }

    public void L() {
        ((TypedArray) this.f4988f).recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0093 -> B:10:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object M(Collection collection, List list, InterfaceC1164c interfaceC1164c, AbstractC0713c abstractC0713c) {
        C0809b c0809b;
        int i4;
        Iterator it;
        int i8;
        InterfaceC1164c interfaceC1164c2;
        b0 b0Var = (b0) this.f4988f;
        b0 b0Var2 = (b0) this.f4987e;
        ArrayList arrayList = (ArrayList) this.f4989g;
        if (abstractC0713c instanceof C0809b) {
            c0809b = (C0809b) abstractC0713c;
            int i9 = c0809b.f11315m;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0809b.f11315m = i9 - Integer.MIN_VALUE;
                Object obj = c0809b.k;
                i4 = c0809b.f11315m;
                int i10 = 1;
                if (i4 == 0) {
                    if (i4 == 1) {
                        i8 = c0809b.j;
                        InterfaceC1053c interfaceC1053c = c0809b.f11313i;
                        it = c0809b.f11312h;
                        InterfaceC1164c interfaceC1164c3 = c0809b.f11311g;
                        Z5.a.d(obj);
                        InterfaceC1052b interfaceC1052b = (InterfaceC1052b) obj;
                        if (interfaceC1052b.getId() != 0) {
                            ((ArrayList) b0Var2.f10987d).add(interfaceC1053c);
                            ((ArrayList) b0Var2.f10989f).add(interfaceC1052b);
                        } else {
                            Iterator it2 = arrayList.iterator();
                            int i11 = 0;
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((InterfaceC1052b) it2.next()).getId() == interfaceC1053c.getId().f12187a) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = -1;
                                    break;
                                }
                            }
                            if (i11 != -1) {
                                ((ArrayList) b0Var.f10987d).add(interfaceC1053c);
                                ((ArrayList) b0Var.f10989f).add(interfaceC1052b);
                                arrayList.remove(i11);
                            }
                        }
                        interfaceC1164c2 = interfaceC1164c3;
                        i10 = 1;
                        if (it.hasNext()) {
                            interfaceC1053c = (InterfaceC1053c) it.next();
                            c0809b.f11311g = interfaceC1164c2;
                            c0809b.f11312h = it;
                            c0809b.f11313i = interfaceC1053c;
                            c0809b.j = i8;
                            c0809b.f11315m = i10;
                            Object l6 = interfaceC1164c2.l(interfaceC1053c, c0809b);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (l6 == enumC0646a) {
                                return enumC0646a;
                            }
                            interfaceC1164c3 = interfaceC1164c2;
                            obj = l6;
                            InterfaceC1052b interfaceC1052b2 = (InterfaceC1052b) obj;
                            if (interfaceC1052b2.getId() != 0) {
                            }
                            interfaceC1164c2 = interfaceC1164c3;
                            i10 = 1;
                            if (it.hasNext()) {
                                return Z5.y.f7506a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    ((ArrayList) b0Var2.f10987d).clear();
                    ((ArrayList) b0Var2.f10989f).clear();
                    ((ArrayList) b0Var.f10987d).clear();
                    ((ArrayList) b0Var.f10989f).clear();
                    arrayList.clear();
                    arrayList.addAll(collection);
                    it = list.iterator();
                    i8 = 0;
                    interfaceC1164c2 = interfaceC1164c;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        c0809b = new C0809b(this, abstractC0713c);
        Object obj2 = c0809b.k;
        i4 = c0809b.f11315m;
        int i102 = 1;
        if (i4 == 0) {
        }
    }

    public k N(String str, i... iVarArr) {
        ArrayList arrayList = new ArrayList(iVarArr.length);
        for (i iVar : iVarArr) {
            arrayList.add(iVar.a());
        }
        String l6 = AbstractC0832f.l(arrayList);
        String str2 = (String) this.f4989g;
        if (str == null || str.length() == 0) {
            str = "";
        }
        return new k(((E0.a) this.f4987e).K(o.Q("\n            SELECT " + l6 + "\n            FROM `" + str2 + "`\n            " + str + "\n        ")), AbstractC0434i.K0(iVarArr));
    }

    public void O(y.e eVar, int i4, int i8) {
        int i9 = eVar.f16348Q;
        int i10 = eVar.f16349R;
        eVar.f16348Q = 0;
        eVar.f16349R = 0;
        eVar.y(i4);
        eVar.v(i8);
        if (i9 < 0) {
            eVar.f16348Q = 0;
        } else {
            eVar.f16348Q = i9;
        }
        if (i10 < 0) {
            eVar.f16349R = 0;
        } else {
            eVar.f16349R = i10;
        }
        ((y.e) this.f4989g).E();
    }

    public void P(long j) {
        if (((LinkedHashMap) this.f4987e).containsKey(Long.valueOf(j))) {
            q(j);
        } else {
            u(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public W Q(I6.i iVar, U6.a aVar, boolean z8) {
        I6.z zVar;
        z6.j jVar;
        A4.a aVar2 = (A4.a) this.f4987e;
        S6.a aVar3 = (S6.a) aVar2.f280e;
        o6.j.e(iVar, "arrayType");
        boolean z9 = aVar.f6173d;
        B b4 = iVar.f2201b;
        if (b4 instanceof I6.z) {
            zVar = (I6.z) b4;
        } else {
            zVar = null;
        }
        if (zVar != null) {
            Class cls = zVar.f2218a;
            if (!o6.j.a(cls, Void.TYPE)) {
                jVar = EnumC1170c.b(cls.getName()).d();
                S6.c cVar = new S6.c(aVar2, iVar, true);
                if (jVar == null) {
                    w7.z r8 = aVar3.f5410o.o().r(jVar);
                    AbstractC1759v l02 = AbstractC0405a.l0(r8, new D6.k(new D6.j[]{r8.getAnnotations(), cVar}));
                    o6.j.c(l02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
                    w7.z zVar2 = (w7.z) l02;
                    if (z9) {
                        return zVar2;
                    }
                    return AbstractC1741c.e(zVar2, zVar2.I0(true));
                }
                AbstractC1759v R5 = R(b4, AbstractC0405a.D0(w7.S.f15974e, z9, null, 6));
                X x8 = X.INVARIANT;
                X x9 = X.OUT_VARIANCE;
                if (z9) {
                    if (z8) {
                        x8 = x9;
                    }
                    return aVar3.f5410o.o().i(x8, R5, cVar);
                }
                return AbstractC1741c.e(aVar3.f5410o.o().i(x8, R5, cVar), aVar3.f5410o.o().i(x9, R5, cVar).I0(true));
            }
        }
        jVar = null;
        S6.c cVar2 = new S6.c(aVar2, iVar, true);
        if (jVar == null) {
        }
    }

    public AbstractC1759v R(W6.d dVar, U6.a aVar) {
        S6.a aVar2 = (S6.a) ((A4.a) this.f4987e).f280e;
        z6.j jVar = null;
        if (dVar instanceof I6.z) {
            Class cls = ((I6.z) dVar).f2218a;
            if (!o6.j.a(cls, Void.TYPE)) {
                jVar = EnumC1170c.b(cls.getName()).d();
            }
            if (jVar != null) {
                return aVar2.f5410o.o().t(jVar);
            }
            return aVar2.f5410o.o().x();
        }
        boolean z8 = false;
        if (dVar instanceof q) {
            q qVar = (q) dVar;
            if (!aVar.f6173d && aVar.f6170a != w7.S.f15973d) {
                z8 = true;
            }
            boolean d2 = qVar.d();
            Type type = qVar.f2210a;
            y7.k kVar = y7.k.UNRESOLVED_JAVA_CLASS;
            if (!d2 && !z8) {
                w7.z k = k(qVar, aVar, null);
                if (k != null) {
                    return k;
                }
                return l.c(kVar, type.toString());
            }
            w7.z k6 = k(qVar, U6.a.a(aVar, U6.b.f6178f, false, null, null, 61), null);
            if (k6 == null) {
                return l.c(kVar, type.toString());
            }
            w7.z k8 = k(qVar, U6.a.a(aVar, U6.b.f6177e, false, null, null, 61), k6);
            if (k8 == null) {
                return l.c(kVar, type.toString());
            }
            if (d2) {
                return new U6.h(k6, k8);
            }
            return AbstractC1741c.e(k6, k8);
        }
        if (dVar instanceof I6.i) {
            return Q((I6.i) dVar, aVar, false);
        }
        if (dVar instanceof E) {
            B c6 = ((E) dVar).c();
            if (c6 != null) {
                return R(c6, aVar);
            }
            return aVar2.f5410o.o().n();
        }
        if (dVar == null) {
            return aVar2.f5410o.o().n();
        }
        throw new UnsupportedOperationException("Unsupported type: " + dVar);
    }

    public void S(String str, ContentValues contentValues) {
        String str2;
        String str3 = (String) this.f4989g;
        Set<Map.Entry<String, Object>> valueSet = contentValues.valueSet();
        o6.j.d(valueSet, "valueSet(...)");
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(valueSet, 10));
        Iterator<T> it = valueSet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (str2 = value.toString()) == null) {
                str2 = "NULL";
            }
            arrayList.add(new j(key, str2));
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            j jVar = (j) it2.next();
            String str4 = (String) jVar.f7485d;
            String str5 = (String) jVar.f7486e;
            if (sb.length() > 0) {
                sb.append(" ,");
            }
            sb.append("`" + str4 + "` = " + str5);
        }
        String sb2 = sb.toString();
        if (str == null || str.length() == 0) {
            str = "";
        }
        v(o.Q("\n            UPDATE `" + str3 + "` \n            SET " + sb2 + "\n            " + str + "\n        "));
    }

    @Override // R.h
    public ClipDescription a() {
        return (ClipDescription) this.f4989g;
    }

    @Override // R.h
    public Object b() {
        return null;
    }

    @Override // R.h
    public Uri c() {
        return (Uri) this.f4987e;
    }

    @Override // R.h
    public Uri e() {
        return (Uri) this.f4988f;
    }

    public void f(int[] iArr, ValueAnimator valueAnimator) {
        Object obj = new Object();
        valueAnimator.addListener((H5.e) this.f4989g);
        ((ArrayList) this.f4987e).add(obj);
    }

    public void g(AbstractC1151c abstractC1151c) {
        String str;
        o6.j.e(abstractC1151c, "column");
        String str2 = (String) this.f4989g;
        String a3 = abstractC1151c.a();
        String b4 = abstractC1151c.b();
        if (abstractC1151c.c()) {
            String d2 = abstractC1151c.d();
            o6.j.b(d2);
            str = "DEFAULT " + d2 + " NOT NULL";
        } else {
            str = "";
        }
        v(o.Q("\n            ALTER TABLE `" + str2 + "`\n            ADD COLUMN `" + a3 + "` " + b4 + "  \n            " + str + "\n        "));
    }

    @Override // M0.a
    public View getRoot() {
        switch (this.f4986d) {
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return (NestedScrollView) this.f4987e;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return (MaterialCardView) this.f4987e;
            default:
                return (FrameLayout) this.f4987e;
        }
    }

    @Override // Z5.g
    public Object getValue() {
        InterfaceC1642c interfaceC1642c = (InterfaceC1642c) this.f4987e;
        m mVar = (m) this.f4989g;
        if (mVar == null) {
            Bundle bundle = (Bundle) ((B6.j) this.f4988f).a();
            t.e eVar = AbstractC1129g.f12753b;
            Method method = (Method) eVar.get(interfaceC1642c);
            if (method == null) {
                method = h2.a.k(interfaceC1642c).getMethod("fromBundle", (Class[]) Arrays.copyOf(AbstractC1129g.f12752a, 1));
                eVar.put(interfaceC1642c, method);
                o6.j.d(method, "also(...)");
            }
            Object invoke = method.invoke(null, bundle);
            o6.j.c(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
            m mVar2 = (m) invoke;
            this.f4989g = mVar2;
            return mVar2;
        }
        return mVar;
    }

    public void h(Set set) {
        E0.a aVar = (E0.a) this.f4987e;
        String str = (String) this.f4989g;
        b0 l6 = h4.g.l(aVar, str, str + "_new", set);
        g p8 = h2.a.p(aVar, (String) l6.f10989f);
        p8.v((String) l6.f10988e);
        String str2 = (String) this.f4989g;
        LinkedHashSet linkedHashSet = (LinkedHashSet) l6.f10990g;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(h2.a.d((String) it.next()));
        }
        j[] jVarArr = (j[]) arrayList.toArray(new j[0]);
        p8.F(str2, null, (j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        r();
        Iterator it2 = ((ArrayList) l6.f10987d).iterator();
        while (it2.hasNext()) {
            p8.v((String) it2.next());
        }
        p8.i((String) this.f4989g);
    }

    public void i(String str) {
        o6.j.e(str, "newTableName");
        v(o.Q("\n            ALTER TABLE `" + ((String) this.f4989g) + "` RENAME TO " + str + "\n        "));
        this.f4989g = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x012d, code lost:
    
        if (r1 != r14) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0203, code lost:
    
        if (r2.isEmpty() == false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [w7.z] */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w7.z k(q qVar, U6.a aVar, w7.z zVar) {
        G B8;
        ?? r18;
        g gVar;
        J j;
        boolean z8;
        J j5;
        J j8;
        Iterator it;
        List list;
        boolean z9;
        M e9;
        X x8;
        Object obj;
        D6.j kVar;
        List list2;
        g gVar2;
        J j9;
        M a3;
        InterfaceC0004e c6;
        E e10;
        InterfaceC0004e interfaceC0004e;
        q qVar2 = qVar;
        w7.S s8 = aVar.f6170a;
        U6.b bVar = aVar.f6171b;
        boolean z10 = aVar.f6173d;
        A4.a aVar2 = (A4.a) this.f4987e;
        S6.a aVar3 = (S6.a) aVar2.f280e;
        if (zVar == null || (B8 = zVar.y0()) == null) {
            B8 = AbstractC1741c.B(new S6.c(aVar2, qVar2, false));
        }
        I6.s sVar = qVar2.f2211b;
        if (sVar != null) {
            boolean z11 = sVar instanceof I6.o;
            X x9 = X.OUT_VARIANCE;
            boolean z12 = false;
            w7.S s9 = w7.S.f15973d;
            U6.b bVar2 = U6.b.f6178f;
            G g8 = B8;
            A4.a aVar4 = aVar2;
            if (z11) {
                r18 = 0;
                I6.o oVar = (I6.o) sVar;
                C0723c c9 = oVar.c();
                if (c9 != null) {
                    if (z10 && c9.equals(U6.d.f6185a)) {
                        z6.l lVar = aVar3.f5411p;
                        z6.k kVar2 = lVar.f16737c;
                        u6.s sVar2 = z6.l.f16734e[0];
                        kVar2.getClass();
                        o6.j.e(sVar2, "property");
                        C0725e e11 = C0725e.e(E2.b.e(sVar2.getName()));
                        InterfaceC0007h d2 = ((InterfaceC1333o) lVar.f16736b.getValue()).d(e11, K6.b.f2731e);
                        if (d2 instanceof InterfaceC0004e) {
                            interfaceC0004e = (InterfaceC0004e) d2;
                        } else {
                            interfaceC0004e = null;
                        }
                        c6 = interfaceC0004e == null ? lVar.f16735a.i(new C0722b(z6.n.f16801i, e11), E2.d.y(1)) : interfaceC0004e;
                    } else {
                        c6 = B6.e.c(c9, aVar3.f5410o.o());
                        if (c6 == null) {
                            c6 = null;
                        } else {
                            String str = B6.d.f457a;
                            C0724d g9 = AbstractC0890e.g(c6);
                            HashMap hashMap = B6.d.k;
                            if (hashMap.containsKey(g9)) {
                                if (bVar != bVar2 && s8 != s9) {
                                    W6.d dVar = (W6.d) AbstractC0436k.y0(qVar2.c());
                                    if (dVar instanceof E) {
                                        e10 = (E) dVar;
                                    } else {
                                        e10 = null;
                                    }
                                    if (e10 != null && e10.c() != null) {
                                        Type[] upperBounds = e10.f2182a.getUpperBounds();
                                        o6.j.d(upperBounds, "getUpperBounds(...)");
                                        if (o6.j.a(AbstractC0434i.X0(upperBounds), Object.class)) {
                                            C0724d g10 = AbstractC0890e.g(c6);
                                            String str2 = B6.d.f457a;
                                            C0723c c0723c = (C0723c) hashMap.get(g10);
                                            if (c0723c != null) {
                                                List e12 = AbstractC1098d.e(c6).j(c0723c).B().e();
                                                o6.j.d(e12, "getParameters(...)");
                                                T t8 = (T) AbstractC0436k.y0(e12);
                                                if (t8 != null) {
                                                    X e02 = t8.e0();
                                                    if (e02 != null) {
                                                    }
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Given class " + c6 + " is not a read-only collection");
                                            }
                                        }
                                    }
                                }
                                c6 = B6.e.a(c6);
                            }
                        }
                    }
                    if (c6 == null) {
                        W0.d dVar2 = aVar3.k;
                        dVar2.getClass();
                        L l6 = (L) dVar2.f6489e;
                        if (l6 != null) {
                            c6 = l6.U(oVar);
                        } else {
                            o6.j.i("resolver");
                            throw null;
                        }
                    }
                    if (c6 != null && (j = c6.B()) != null) {
                        gVar = this;
                    } else {
                        qVar2.getClass();
                        throw new UnsupportedOperationException("Type not found: " + qVar2.f2210a);
                    }
                } else {
                    throw new AssertionError("Class type should have a FQ name: " + sVar);
                }
            } else {
                r18 = 0;
                r18 = 0;
                if (sVar instanceof C) {
                    gVar = this;
                    T a4 = ((S6.f) gVar.f4988f).a((C) sVar);
                    if (a4 != null) {
                        j = a4.B();
                    } else {
                        j = null;
                    }
                } else {
                    throw new IllegalStateException("Unknown classifier kind: " + sVar);
                }
            }
            if (j == null) {
                return r18;
            }
            if (bVar == bVar2 || z10 || s8 == s9) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (zVar != null) {
                j5 = zVar.B0();
            } else {
                j5 = r18;
            }
            if (o6.j.a(j5, j) && !qVar2.d() && z8) {
                return zVar.I0(true);
            }
            boolean z13 = true;
            if (!qVar2.d()) {
                if (qVar2.c().isEmpty()) {
                    List e13 = j.e();
                    o6.j.d(e13, "getParameters(...)");
                    z13 = true;
                }
                z13 = false;
            }
            List<T> e14 = j.e();
            o6.j.d(e14, "getParameters(...)");
            if (z13) {
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(e14, 10));
                J j10 = r18;
                for (T t9 : e14) {
                    if (AbstractC0405a.U(t9, j10, aVar.f6174e)) {
                        a3 = U.k(t9, aVar);
                        j9 = j;
                        gVar2 = gVar;
                    } else {
                        J j11 = j;
                        gVar2 = gVar;
                        j9 = j11;
                        a3 = U6.e.a(t9, U6.a.a(aVar, null, qVar.d(), null, null, 59), (C1536c) gVar2.f4989g, new C1761x(aVar3.f5398a, new U6.c(gVar, t9, aVar, j11, qVar2)));
                    }
                    arrayList.add(a3);
                    qVar2 = qVar;
                    j = j9;
                    gVar = gVar2;
                    j10 = null;
                }
                j8 = j;
                list2 = arrayList;
            } else {
                j8 = j;
                g gVar3 = gVar;
                if (e14.size() != qVar.c().size()) {
                    ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(e14, 10));
                    Iterator it2 = e14.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new w7.E(l.c(y7.k.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, ((T) it2.next()).getName().b())));
                    }
                    list2 = AbstractC0436k.Q0(arrayList2);
                } else {
                    H7.q W02 = AbstractC0436k.W0(qVar.c());
                    ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(W02, 10));
                    Iterator it3 = W02.iterator();
                    while (true) {
                        H7.b bVar3 = (H7.b) it3;
                        if (bVar3.f2047e.hasNext()) {
                            a6.v vVar = (a6.v) bVar3.next();
                            int i4 = vVar.f7769a;
                            W6.d dVar3 = (W6.d) vVar.f7770b;
                            e14.size();
                            T t10 = (T) e14.get(i4);
                            w7.S s10 = w7.S.f15974e;
                            U6.a D02 = AbstractC0405a.D0(s10, z12, null, 7);
                            o6.j.b(t10);
                            boolean z14 = dVar3 instanceof E;
                            X x10 = X.INVARIANT;
                            if (z14) {
                                E e15 = (E) dVar3;
                                B c10 = e15.c();
                                Type[] upperBounds2 = e15.f2182a.getUpperBounds();
                                o6.j.d(upperBounds2, "getUpperBounds(...)");
                                if (!o6.j.a(AbstractC0434i.X0(upperBounds2), Object.class)) {
                                    x8 = x9;
                                } else {
                                    x8 = X.IN_VARIANCE;
                                }
                                it = it3;
                                if (c10 == null || (t10.e0() != x10 && x8 != t10.e0())) {
                                    list = e14;
                                    A4.a aVar5 = aVar4;
                                    z9 = false;
                                    e9 = U.k(t10, D02);
                                    aVar4 = aVar5;
                                } else {
                                    o6.j.e(e15, "wildcardType");
                                    if (e15.c() != null) {
                                        A4.a aVar6 = aVar4;
                                        Iterator it4 = new S6.c(aVar6, e15, false).iterator();
                                        while (true) {
                                            H7.f fVar = (H7.f) it4;
                                            if (fVar.hasNext()) {
                                                obj = fVar.next();
                                                D6.c cVar = (D6.c) obj;
                                                Iterator it5 = it4;
                                                C0723c[] c0723cArr = P6.q.f4579b;
                                                list = e14;
                                                int length = c0723cArr.length;
                                                int i8 = 0;
                                                while (i8 < length) {
                                                    int i9 = i8;
                                                    int i10 = length;
                                                    if (o6.j.a(cVar.a(), c0723cArr[i9])) {
                                                        break;
                                                    }
                                                    i8 = i9 + 1;
                                                    length = i10;
                                                }
                                                it4 = it5;
                                                e14 = list;
                                            } else {
                                                list = e14;
                                                obj = null;
                                                break;
                                            }
                                        }
                                        D6.c cVar2 = (D6.c) obj;
                                        z9 = false;
                                        AbstractC1759v R5 = gVar3.R(c10, AbstractC0405a.D0(s10, false, null, 7));
                                        if (cVar2 != null) {
                                            ArrayList B02 = AbstractC0436k.B0(R5.getAnnotations(), cVar2);
                                            if (B02.isEmpty()) {
                                                kVar = D6.i.f1043a;
                                            } else {
                                                kVar = new D6.k(false ? 1 : 0, B02);
                                            }
                                            R5 = AbstractC0405a.l0(R5, kVar);
                                        }
                                        e9 = AbstractC0405a.t(R5, x8, t10);
                                        aVar4 = aVar6;
                                    } else {
                                        throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
                                    }
                                }
                            } else {
                                it = it3;
                                list = e14;
                                z9 = false;
                                e9 = new w7.E(gVar3.R(dVar3, D02), x10);
                            }
                            arrayList3.add(e9);
                            it3 = it;
                            z12 = z9;
                            e14 = list;
                        } else {
                            list2 = AbstractC0436k.Q0(arrayList3);
                            break;
                        }
                    }
                }
            }
            return AbstractC1741c.t(list2, g8, j8, z8);
        }
        qVar2.getClass();
        throw new UnsupportedOperationException("Type not found: " + qVar2.f2210a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
    
        if (L7.AbstractC0166y.A(r12, r0, r9) != r11) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, o6.s] */
    /* JADX WARN: Type inference failed for: r3v5, types: [f6.j, n6.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(Uri uri, List list, List list2, Point point, A4.a aVar, AbstractC0713c abstractC0713c) {
        V2.a aVar2;
        int i4;
        A4.a aVar3;
        s sVar;
        List list3;
        List list4;
        Point point2;
        Uri uri2;
        if (abstractC0713c instanceof V2.a) {
            aVar2 = (V2.a) abstractC0713c;
            int i8 = aVar2.f6321o;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar2.f6321o = i8 - Integer.MIN_VALUE;
                V2.a aVar4 = aVar2;
                Object obj = aVar4.f6319m;
                i4 = aVar4.f6321o;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj);
                            return Z5.y.f7506a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s sVar2 = aVar4.f6318l;
                    aVar3 = aVar4.k;
                    Point point3 = aVar4.j;
                    List list5 = aVar4.f6317i;
                    List list6 = aVar4.f6316h;
                    Uri uri3 = aVar4.f6315g;
                    Z5.a.d(obj);
                    point2 = point3;
                    list4 = list5;
                    list3 = list6;
                    uri2 = uri3;
                    sVar = sVar2;
                } else {
                    Z5.a.d(obj);
                    Objects.toString(uri);
                    Objects.toString(list);
                    ((X2.a) this.f4988f).j();
                    ((Z2.d) this.f4989g).j();
                    ?? obj2 = new Object();
                    ?? r32 = (AbstractC0720j) aVar.f280e;
                    Integer num = new Integer(obj2.f13640d);
                    Integer num2 = new Integer(list.size());
                    aVar4.f6315g = uri;
                    aVar4.f6316h = list;
                    aVar4.f6317i = list2;
                    aVar4.j = point;
                    aVar4.k = aVar;
                    aVar4.f6318l = obj2;
                    aVar4.f6321o = 1;
                    if (r32.j(num, num2, aVar4) != enumC0646a) {
                        aVar3 = aVar;
                        sVar = obj2;
                        list3 = list;
                        list4 = list2;
                        point2 = point;
                        uri2 = uri;
                    }
                    return enumC0646a;
                }
                S7.e eVar = F.f3175a;
                S7.d dVar = S7.d.f5456f;
                V2.b bVar = new V2.b(this, uri2, aVar3, list4, list3, point2, sVar, null);
                aVar4.f6315g = null;
                aVar4.f6316h = null;
                aVar4.f6317i = null;
                aVar4.j = null;
                aVar4.k = null;
                aVar4.f6318l = null;
                aVar4.f6321o = 2;
            }
        }
        aVar2 = new V2.a(this, abstractC0713c);
        V2.a aVar42 = aVar2;
        Object obj3 = aVar42.f6319m;
        i4 = aVar42.f6321o;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        S7.e eVar2 = F.f3175a;
        S7.d dVar2 = S7.d.f5456f;
        V2.b bVar2 = new V2.b(this, uri2, aVar3, list4, list3, point2, sVar, null);
        aVar42.f6315g = null;
        aVar42.f6316h = null;
        aVar42.f6317i = null;
        aVar42.j = null;
        aVar42.k = null;
        aVar42.f6318l = null;
        aVar42.f6321o = 2;
    }

    public void n(C1152d c1152d, String str) {
        o6.j.e(c1152d, "foreignKey");
        String str2 = c1152d.f12841a;
        String str3 = (String) this.f4989g;
        o6.j.e(str3, "tableName");
        if (str == null || str.length() == 0) {
            str = "index_" + str3 + "_" + str2;
        }
        v(o.Q("\n            CREATE INDEX IF NOT EXISTS `" + str + "` \n                ON `" + ((String) this.f4989g) + "` (`" + str2 + "`)\n        "));
    }

    public void o(Set set) {
        String str;
        String str2 = (String) this.f4989g;
        String p8 = A.j.p("`", ((n1.g) this.f4988f).f12850a, "` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!(iVar instanceof n1.g)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("`" + iVar.a() + "` " + iVar.b());
                if (iVar.c()) {
                    sb.append(" NOT NULL");
                    if (iVar instanceof AbstractC1151c) {
                        AbstractC1151c abstractC1151c = (AbstractC1151c) iVar;
                        if (abstractC1151c.d() != null) {
                            sb.append(" DEFAULT " + abstractC1151c.d());
                        }
                    }
                }
                if (iVar instanceof C1152d) {
                    arrayList.add(iVar);
                }
            } else {
                throw new IllegalArgumentException("Primary key column not supported by formatAsSQLiteCreateTableColumnList");
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1152d c1152d = (C1152d) it2.next();
            String str3 = c1152d.f12841a;
            String str4 = c1152d.f12843c;
            int i4 = c1152d.f12844d;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 == 5) {
                                str = "CASCADE";
                            } else {
                                throw new UnsupportedOperationException("Invalid foreign key action");
                            }
                        } else {
                            str = "SET DEFAULT";
                        }
                    } else {
                        str = "SET NULL";
                    }
                } else {
                    str = "RESTRICT";
                }
            } else {
                str = "NO ACTION";
            }
            sb.append(o.Q(",\n            " + ("FOREIGN KEY(`" + str3 + "`) REFERENCES `" + str4 + "`(`id`) ON UPDATE NO ACTION ON DELETE " + str) + "\n    "));
        }
        v(o.Q("\n            CREATE TABLE IF NOT EXISTS `" + str2 + "` (\n                " + p8 + ",\n                " + sb.toString() + "\n            )\n        "));
    }

    public void q(long j) {
        AbstractC0951a abstractC0951a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4987e;
        if (linkedHashMap.containsKey(Long.valueOf(j)) && (abstractC0951a = (AbstractC0951a) ((C0538f) this.f4988f).get(Long.valueOf(j))) != null) {
            linkedHashMap.remove(Long.valueOf(j));
            C1562a c1562a = (C1562a) this.f4989g;
            if (c1562a != null) {
                b0 b0Var = (b0) c1562a.f15048d;
                for (AbstractC0901a abstractC0901a : abstractC0951a.i()) {
                    if (abstractC0901a instanceof j2.f) {
                        ((LinkedHashMap) ((C1536c) b0Var.f10990g).f14809f).remove(Long.valueOf(abstractC0901a.c()));
                    }
                }
            }
        }
    }

    public void r() {
        v(o.Q("\n            DROP TABLE IF EXISTS `" + ((String) this.f4989g) + "`\n        "));
    }

    public String toString() {
        switch (this.f4986d) {
            case 10:
                int size = ((ArrayList) ((b0) this.f4987e).f10987d).size();
                int size2 = ((ArrayList) ((b0) this.f4988f).f10987d).size();
                int size3 = ((ArrayList) this.f4989g).size();
                StringBuilder sb = new StringBuilder("DatabaseListUpdater[toBeAdded=");
                sb.append(size);
                sb.append("; toBeUpdated=");
                sb.append(size2);
                sb.append("; teBeRemoved=");
                return AbstractC1149a.h(sb, size3, "]");
            case 15:
                String str = (String) this.f4989g;
                String str2 = (String) this.f4988f;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f4987e;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb2.append(" action=");
                    sb2.append(str2);
                }
                if (str != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str);
                }
                sb2.append(" }");
                String sb3 = sb2.toString();
                o6.j.d(sb3, "toString(...)");
                return sb3;
            default:
                return super.toString();
        }
    }

    public void u(long j) {
        AbstractC0951a abstractC0951a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4987e;
        if (!linkedHashMap.containsKey(Long.valueOf(j)) && (abstractC0951a = (AbstractC0951a) ((C0538f) this.f4988f).get(Long.valueOf(j))) != null) {
            linkedHashMap.put(Long.valueOf(j), abstractC0951a);
            C1562a c1562a = (C1562a) this.f4989g;
            if (c1562a != null) {
                b0 b0Var = (b0) c1562a.f15048d;
                for (AbstractC0901a abstractC0901a : abstractC0951a.i()) {
                    if (abstractC0901a instanceof j2.f) {
                        C1536c c1536c = (C1536c) b0Var.f10990g;
                        j2.f fVar = (j2.f) abstractC0901a;
                        c1536c.getClass();
                        o6.j.e(fVar, "condition");
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c1536c.f14809f;
                        Long valueOf = Long.valueOf(fVar.c());
                        long currentTimeMillis = System.currentTimeMillis();
                        long j5 = fVar.f11817d;
                        long j8 = Long.MAX_VALUE;
                        if (Long.MAX_VALUE - j5 >= currentTimeMillis) {
                            j8 = currentTimeMillis + j5;
                        }
                        linkedHashMap2.put(valueOf, Long.valueOf(j8));
                    }
                }
            }
        }
    }

    public void v(String str) {
        o6.j.e(str, "statement");
        ((E0.a) this.f4987e).m(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(InterfaceC1164c interfaceC1164c, InterfaceC1164c interfaceC1164c2, InterfaceC1164c interfaceC1164c3, InterfaceC1167f interfaceC1167f, AbstractC0713c abstractC0713c) {
        C0808a c0808a;
        C0808a c0808a2;
        int i4;
        Map linkedHashMap;
        InterfaceC1164c interfaceC1164c4;
        InterfaceC1167f interfaceC1167f2;
        InterfaceC1164c interfaceC1164c5;
        ArrayList arrayList;
        v6.a aVar;
        ArrayList arrayList2;
        Object obj;
        InterfaceC1167f interfaceC1167f3;
        InterfaceC1164c interfaceC1164c6;
        ArrayList arrayList3 = (ArrayList) this.f4989g;
        b0 b0Var = (b0) this.f4988f;
        b0 b0Var2 = (b0) this.f4987e;
        if (abstractC0713c instanceof C0808a) {
            c0808a = (C0808a) abstractC0713c;
            int i8 = c0808a.f11310m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0808a.f11310m = i8 - Integer.MIN_VALUE;
                c0808a2 = c0808a;
                Object obj2 = c0808a2.k;
                i4 = c0808a2.f11310m;
                Z5.y yVar = Z5.y.f7506a;
                Object obj3 = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    Z5.a.d(obj2);
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            linkedHashMap = c0808a2.j;
                            interfaceC1167f3 = c0808a2.f11308i;
                            Z5.a.d(obj2);
                            obj = obj3;
                            if (interfaceC1167f3 != null) {
                                ArrayList arrayList4 = (ArrayList) b0Var2.f10988e;
                                ArrayList arrayList5 = (ArrayList) b0Var.f10988e;
                                c0808a2.f11306g = null;
                                c0808a2.f11307h = null;
                                c0808a2.f11308i = null;
                                c0808a2.j = null;
                                c0808a2.f11310m = 4;
                                if (interfaceC1167f3.b(linkedHashMap, arrayList4, arrayList5, arrayList3, c0808a2) == obj) {
                                    return obj;
                                }
                            }
                            return yVar;
                        }
                        linkedHashMap = c0808a2.j;
                        InterfaceC1167f interfaceC1167f4 = c0808a2.f11308i;
                        interfaceC1164c6 = c0808a2.f11307h;
                        Z5.a.d(obj2);
                        arrayList = arrayList3;
                        interfaceC1167f3 = interfaceC1167f4;
                        obj = obj3;
                        aVar = null;
                        c0808a2.f11306g = aVar;
                        c0808a2.f11307h = aVar;
                        c0808a2.f11308i = interfaceC1167f3;
                        c0808a2.j = linkedHashMap;
                        c0808a2.f11310m = 3;
                        arrayList3 = arrayList;
                        if (interfaceC1164c6.l(arrayList3, c0808a2) == obj) {
                            return obj;
                        }
                        if (interfaceC1167f3 != null) {
                        }
                        return yVar;
                    }
                    linkedHashMap = c0808a2.j;
                    interfaceC1167f2 = c0808a2.f11308i;
                    interfaceC1164c4 = c0808a2.f11307h;
                    interfaceC1164c5 = (InterfaceC1164c) c0808a2.f11306g;
                    Z5.a.d(obj2);
                } else {
                    Z5.a.d(obj2);
                    linkedHashMap = new LinkedHashMap();
                    Object obj4 = (ArrayList) b0Var2.f10990g;
                    c0808a2.f11306g = (o6.i) interfaceC1164c2;
                    interfaceC1164c4 = interfaceC1164c3;
                    c0808a2.f11307h = interfaceC1164c4;
                    c0808a2.f11308i = interfaceC1167f;
                    c0808a2.j = linkedHashMap;
                    c0808a2.f11310m = 1;
                    obj2 = interfaceC1164c.l(obj4, c0808a2);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                    interfaceC1167f2 = interfaceC1167f;
                    interfaceC1164c5 = interfaceC1164c2;
                }
                int i9 = 0;
                for (Object obj5 : (Iterable) obj2) {
                    int i10 = i9 + 1;
                    if (i9 >= 0) {
                        ArrayList arrayList6 = arrayList3;
                        long longValue = ((Number) obj5).longValue();
                        Long a3 = ((InterfaceC1053c) ((ArrayList) b0Var2.f10988e).get(i9)).a();
                        Object obj6 = obj3;
                        if (a3 != null) {
                            linkedHashMap.put(new Long(a3.longValue()), new Long(longValue));
                        }
                        i9 = i10;
                        arrayList3 = arrayList6;
                        obj3 = obj6;
                    } else {
                        AbstractC0437l.c0();
                        throw null;
                    }
                }
                arrayList = arrayList3;
                aVar = null;
                arrayList2 = (ArrayList) b0Var.f10990g;
                c0808a2.f11306g = null;
                c0808a2.f11307h = interfaceC1164c4;
                c0808a2.f11308i = interfaceC1167f2;
                c0808a2.j = linkedHashMap;
                c0808a2.f11310m = 2;
                obj = obj3;
                if (interfaceC1164c5.l(arrayList2, c0808a2) == obj) {
                    interfaceC1167f3 = interfaceC1167f2;
                    interfaceC1164c6 = interfaceC1164c4;
                    c0808a2.f11306g = aVar;
                    c0808a2.f11307h = aVar;
                    c0808a2.f11308i = interfaceC1167f3;
                    c0808a2.j = linkedHashMap;
                    c0808a2.f11310m = 3;
                    arrayList3 = arrayList;
                    if (interfaceC1164c6.l(arrayList3, c0808a2) == obj) {
                    }
                    if (interfaceC1167f3 != null) {
                    }
                    return yVar;
                }
                return obj;
            }
        }
        c0808a = new C0808a(this, abstractC0713c);
        c0808a2 = c0808a;
        Object obj22 = c0808a2.k;
        i4 = c0808a2.f11310m;
        Z5.y yVar2 = Z5.y.f7506a;
        Object obj32 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        int i92 = 0;
        while (r1.hasNext()) {
        }
        arrayList = arrayList3;
        aVar = null;
        arrayList2 = (ArrayList) b0Var.f10990g;
        c0808a2.f11306g = null;
        c0808a2.f11307h = interfaceC1164c4;
        c0808a2.f11308i = interfaceC1167f2;
        c0808a2.j = linkedHashMap;
        c0808a2.f11310m = 2;
        obj = obj32;
        if (interfaceC1164c5.l(arrayList2, c0808a2) == obj) {
        }
    }

    @Override // O7.InterfaceC0233f
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f4986d) {
            case 1:
                ((i0) this.f4987e).x(new C0027c(interfaceC0234g, (M4.f) this.f4988f, (S4.k) this.f4989g, 5), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Object x8 = ((W5.a) this.f4987e).x(new V(interfaceC0234g, (N) this.f4988f, (Context) this.f4989g, 1), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 13:
                Object x9 = ((Y3.z) this.f4987e).x(new V(interfaceC0234g, (k4.X) this.f4988f, (Context) this.f4989g, 4), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            default:
                Object x10 = ((Y3.z) this.f4987e).x(new C0027c(interfaceC0234g, (x) this.f4988f, (Context) this.f4989g, 6), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
        }
    }

    public long y(C0999a c0999a) {
        Long l6 = c0999a.f12188b;
        if (l6 == null) {
            long j = c0999a.f12187a;
            if (j != 0) {
                return j;
            }
        }
        Long l8 = (Long) ((LinkedHashMap) this.f4989g).get(l6);
        if (l8 != null) {
            return l8.longValue();
        }
        throw new IllegalStateException("Identifier is not found in action map for " + c0999a);
    }

    public ColorStateList z(int i4) {
        int resourceId;
        ColorStateList o7;
        TypedArray typedArray = (TypedArray) this.f4988f;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0 && (o7 = AbstractC1492c.o((Context) this.f4987e, resourceId)) != null) {
            return o7;
        }
        return typedArray.getColorStateList(i4);
    }

    public g(int i4) {
        this.f4986d = i4;
        switch (i4) {
            case 10:
                this.f4987e = new b0(1);
                this.f4988f = new b0(1);
                this.f4989g = new ArrayList();
                return;
            case 21:
                this.f4987e = new ArrayList();
                this.f4988f = null;
                this.f4989g = new H5.e(10, this);
                return;
            default:
                this.f4987e = new LinkedHashMap();
                this.f4988f = new LinkedHashMap();
                this.f4989g = new LinkedHashMap();
                return;
        }
    }

    public g(E0.a aVar, String str, n1.g gVar) {
        this.f4986d = 16;
        o6.j.e(aVar, "databaseSQLite");
        o6.j.e(str, "name");
        this.f4987e = aVar;
        this.f4988f = gVar;
        this.f4989g = str;
    }

    public g(InterfaceC1642c interfaceC1642c, B6.j jVar) {
        this.f4986d = 14;
        o6.j.e(interfaceC1642c, "navArgsClass");
        this.f4987e = interfaceC1642c;
        this.f4988f = jVar;
    }

    public g(FrameLayout frameLayout, ConstraintLayout constraintLayout, ItemBriefView itemBriefView, MaterialTextView materialTextView) {
        this.f4986d = 20;
        this.f4987e = frameLayout;
        this.f4988f = itemBriefView;
        this.f4989g = materialTextView;
    }

    public g(File file, ContentResolver contentResolver) {
        this.f4986d = 5;
        this.f4987e = contentResolver;
        this.f4988f = new X2.a(file);
        this.f4989g = new Z2.d(file);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, U6.e] */
    public g(A4.a aVar, S6.f fVar) {
        this.f4986d = 4;
        o6.j.e(fVar, "typeParameterResolver");
        this.f4987e = aVar;
        this.f4988f = fVar;
        this.f4989g = new C1536c((U6.e) new Object());
    }

    public g(InterfaceC1871b interfaceC1871b, View view) {
        Object obj;
        this.f4986d = 24;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            obj = new Object();
        } else {
            obj = i4 >= 33 ? new Object() : null;
        }
        this.f4987e = obj;
        this.f4988f = interfaceC1871b;
        this.f4989g = view;
    }

    @Override // R.h
    public void d() {
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f4986d = 0;
        this.f4987e = uri;
        this.f4989g = clipDescription;
        this.f4988f = uri2;
    }

    public g(Context context, TypedArray typedArray) {
        this.f4986d = 17;
        this.f4987e = context;
        this.f4988f = typedArray;
    }

    public g(Context context, LocationManager locationManager) {
        this.f4986d = 11;
        this.f4989g = new Object();
        this.f4987e = context;
        this.f4988f = locationManager;
    }

    public g(C1588c c1588c, List[] listArr, Method method) {
        this.f4986d = 22;
        o6.j.e(c1588c, "argumentRange");
        this.f4987e = c1588c;
        this.f4988f = listArr;
        this.f4989g = method;
    }

    public g(y.e eVar) {
        this.f4986d = 23;
        this.f4987e = new ArrayList();
        this.f4988f = new Object();
        this.f4989g = eVar;
    }

    public g(List list) {
        this.f4986d = 18;
        o6.j.e(list, "events");
        this.f4987e = new LinkedHashMap();
        C0538f c0538f = new C0538f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0951a abstractC0951a = (AbstractC0951a) it.next();
            if (abstractC0951a.j()) {
                ((LinkedHashMap) this.f4987e).put(Long.valueOf(abstractC0951a.c()), abstractC0951a);
            }
            c0538f.put(Long.valueOf(abstractC0951a.c()), abstractC0951a);
        }
        this.f4988f = c0538f.c();
    }

    public g(A4.a aVar, C1594d c1594d, c0.d dVar, Set set) {
        this.f4986d = 8;
        this.f4987e = c1594d;
        this.f4988f = aVar;
        this.f4989g = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            K(str, 0, str.length(), 1, true, new t(str, 1));
        }
    }

    public g(W0.c cVar) {
        this.f4986d = 7;
        this.f4986d = 7;
        this.f4987e = cVar;
        this.f4988f = Choreographer.getInstance();
        this.f4989g = new ChoreographerFrameCallbackC0516a(this);
    }
}
