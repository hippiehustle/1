package G5;

import P.InterfaceC0271t;
import P.O;
import P.t0;
import T1.A;
import T1.B;
import T1.C;
import T1.C0304c;
import T1.C0310i;
import T1.C0313l;
import T1.C0316o;
import T1.EnumC0305d;
import T1.EnumC0306e;
import T1.EnumC0307f;
import T1.F;
import T1.G;
import T1.H;
import T1.K;
import T1.N;
import T1.x;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.View;
import androidx.cardview.widget.CardView;
import c0.z;
import d6.InterfaceC0621g;
import e0.C0634b;
import h4.AbstractC0832f;
import i.AbstractC0863b;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipInputStream;
import k0.InterfaceC0947b;
import kotlin.NoWhenBranchMatchedException;
import s.AbstractC1476b;
import s.C1475a;
import t6.C1590e;
import t7.C1594d;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public class e implements InterfaceC0271t, W2.b, InterfaceC0947b, x5.s, r0.d, InterfaceC0621g {

    /* renamed from: e, reason: collision with root package name */
    public static e f1749e;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1750d;

    public /* synthetic */ e(int i4) {
        this.f1750d = i4;
    }

    public static Path s(float f8, float f9, float f10, float f11) {
        Path path = new Path();
        path.moveTo(f8, f9);
        path.lineTo(f10, f11);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean u(C0634b c0634b, Editable editable, int i4, int i8, boolean z8) {
        int min;
        if (editable != null && i4 >= 0 && i8 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z8) {
                    int max = Math.max(i4, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z9 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z9) {
                                        selectionStart = 0;
                                    }
                                } else {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z9) {
                                        break;
                                    }
                                    if (Character.isSurrogate(charAt)) {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z9 = true;
                                    } else {
                                        max--;
                                    }
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i8, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z10 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z10) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z10 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i4, 0);
                    min = Math.min(selectionEnd + i8, editable.length());
                }
                z[] zVarArr = (z[]) editable.getSpans(selectionStart, min, z.class);
                if (zVarArr != null && zVarArr.length > 0) {
                    for (z zVar : zVarArr) {
                        int spanStart = editable.getSpanStart(zVar);
                        int spanEnd = editable.getSpanEnd(zVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    c0634b.beginBatchEdit();
                    editable.delete(max3, min2);
                    c0634b.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public float a(float f8, float f9) {
        return 1.0f;
    }

    @Override // x5.s
    public t0 b(View view, t0 t0Var, x5.t tVar) {
        int i4;
        tVar.f16223d = t0Var.a() + tVar.f16223d;
        WeakHashMap weakHashMap = O.f4214a;
        boolean z8 = true;
        if (view.getLayoutDirection() != 1) {
            z8 = false;
        }
        int b4 = t0Var.b();
        int c6 = t0Var.c();
        int i8 = tVar.f16220a;
        if (z8) {
            i4 = c6;
        } else {
            i4 = b4;
        }
        int i9 = i8 + i4;
        tVar.f16220a = i9;
        int i10 = tVar.f16222c;
        if (!z8) {
            b4 = c6;
        }
        int i11 = i10 + b4;
        tVar.f16222c = i11;
        view.setPaddingRelative(i9, tVar.f16221b, i11, tVar.f16223d);
        return t0Var;
    }

    @Override // W2.b
    public void c(Object obj, FileOutputStream fileOutputStream) {
        Z2.c cVar = (Z2.c) obj;
        o6.j.e(cVar, "scenarioBackup");
        a8.b bVar = a8.b.f8279d;
        bVar.getClass();
        AbstractC1638C.u(bVar, Z2.c.Companion.serializer(), cVar, fileOutputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    @Override // W2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(ZipInputStream zipInputStream) {
        int i4;
        e eVar;
        C0316o c0316o;
        int i8;
        o6.j.e(zipInputStream, "json");
        a8.u d2 = a8.k.d(a8.b.f8279d.b(new String(AbstractC0863b.r(zipInputStream), I7.a.f2219a)));
        Integer i9 = AbstractC0863b.i(d2, "version", true);
        if (i9 != null) {
            i4 = i9.intValue();
        } else {
            i4 = -1;
        }
        a8.u l6 = AbstractC0863b.l(d2, "scenario", true);
        if (l6 != null) {
            if (i4 < 8) {
                Log.w("ScenarioDeserializerFactory", "Json object version not supported, minimum=8, actual=" + i4);
            } else {
                if (i4 < 11) {
                    eVar = new W1.d();
                } else if (i4 < 13) {
                    eVar = new W1.d();
                } else if (i4 < 18) {
                    eVar = new e(10);
                } else if (i4 == 18) {
                    eVar = new e(8);
                } else {
                    Log.w("ScenarioDeserializerFactory", "Json object version not supported, maximum=18, actual=" + i4);
                }
                if (eVar == null) {
                    c0316o = eVar.i(l6);
                } else {
                    c0316o = null;
                }
                if (c0316o != null) {
                    int i10 = 0;
                    Integer i11 = AbstractC0863b.i(d2, "screenWidth", false);
                    if (i11 != null) {
                        i8 = i11.intValue();
                    } else {
                        i8 = 0;
                    }
                    Integer i12 = AbstractC0863b.i(d2, "screenHeight", false);
                    if (i12 != null) {
                        i10 = i12.intValue();
                    }
                    return new Z2.c(i4, i8, i10, c0316o);
                }
            }
            eVar = null;
            if (eVar == null) {
            }
            if (c0316o != null) {
            }
        }
        Log.w("ScenarioDeserializer", "Can't deserialize scenario.");
        return null;
    }

    public C0304c e(a8.u uVar) {
        EnumC0306e enumC0306e;
        EnumC0306e enumC0306e2;
        int i4;
        String str;
        String str2;
        int intValue;
        Long m6 = AbstractC0863b.m(uVar, "id", true);
        T1.u uVar2 = null;
        if (m6 != null) {
            long longValue = m6.longValue();
            Long m8 = AbstractC0863b.m(uVar, "eventId", true);
            if (m8 != null) {
                long longValue2 = m8.longValue();
                int i8 = 0;
                String p8 = AbstractC0863b.p(uVar, "counterName", false);
                if (p8 != null) {
                    String p9 = AbstractC0863b.p(uVar, "counterOperation", false);
                    if (p9 != null) {
                        try {
                            enumC0306e = EnumC0306e.valueOf(p9);
                        } catch (IllegalArgumentException unused) {
                            enumC0306e = null;
                        }
                        enumC0306e2 = enumC0306e;
                    } else {
                        enumC0306e2 = null;
                    }
                    if (enumC0306e2 != null) {
                        String p10 = AbstractC0863b.p(uVar, "counterOperationValueType", false);
                        if (p10 != null) {
                            try {
                                uVar2 = T1.u.valueOf(p10);
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                        if (uVar2 == null) {
                            uVar2 = T1.u.f5647d;
                        }
                        T1.u uVar3 = uVar2;
                        Integer i9 = AbstractC0863b.i(uVar, "counterOperationValue", false);
                        if (i9 != null) {
                            i4 = i9.intValue();
                        } else {
                            i4 = 0;
                        }
                        String p11 = AbstractC0863b.p(uVar, "counterOperationCounterName", false);
                        if (p11 == null) {
                            str = "";
                        } else {
                            str = p11;
                        }
                        String p12 = AbstractC0863b.p(uVar, "name", false);
                        if (p12 == null) {
                            str2 = "";
                        } else {
                            str2 = p12;
                        }
                        Integer i10 = AbstractC0863b.i(uVar, "priority", false);
                        if (i10 != null && (intValue = i10.intValue()) >= 0) {
                            i8 = intValue;
                        }
                        return new C0304c(longValue, longValue2, i8, str2, EnumC0305d.f5587i, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, p8, enumC0306e2, uVar3, Integer.valueOf(i4), str, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -1040187424, 31);
                    }
                }
            }
        }
        return null;
    }

    public C0304c f(a8.u uVar, ArrayList arrayList, int i4) {
        EnumC0307f enumC0307f;
        EnumC0307f enumC0307f2;
        boolean z8;
        Integer i8;
        Integer num;
        Long l6;
        Integer num2;
        Integer num3;
        Integer num4;
        int i9;
        long j;
        Long m6 = AbstractC0863b.m(uVar, "id", true);
        if (m6 != null) {
            long longValue = m6.longValue();
            Long m8 = AbstractC0863b.m(uVar, "eventId", true);
            if (m8 != null) {
                long longValue2 = m8.longValue();
                String p8 = AbstractC0863b.p(uVar, "clickPositionType", true);
                if (p8 != null) {
                    try {
                        enumC0307f = EnumC0307f.valueOf(p8);
                    } catch (IllegalArgumentException unused) {
                        Log.w("JsonObject", "Can't create IntentExtraType, value " + p8 + " is invalid");
                        enumC0307f = null;
                    }
                    enumC0307f2 = enumC0307f;
                } else {
                    enumC0307f2 = null;
                }
                if (enumC0307f2 != null) {
                    if (i4 == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int ordinal = enumC0307f2.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            Long m9 = AbstractC0863b.m(uVar, "clickOnConditionId", z8);
                            if (z8 && (m9 == null || !h7.u.a(arrayList, m9.longValue()))) {
                                Log.w("DeserializerCompat", "Can't deserialize action, clickOnConditionId is not valid.");
                                return null;
                            }
                            l6 = m9;
                            num4 = null;
                            num = null;
                            num2 = AbstractC0863b.i(uVar, "clickOffsetX", false);
                            num3 = AbstractC0863b.i(uVar, "clickOffsetY", false);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        Integer i10 = AbstractC0863b.i(uVar, "x", true);
                        if (i10 != null && (i8 = AbstractC0863b.i(uVar, "y", true)) != null) {
                            num = i8;
                            l6 = null;
                            num2 = null;
                            num3 = null;
                            num4 = i10;
                        }
                    }
                    String p9 = AbstractC0863b.p(uVar, "name", false);
                    if (p9 == null) {
                        p9 = "";
                    }
                    String str = p9;
                    Integer i11 = AbstractC0863b.i(uVar, "priority", false);
                    if (i11 != null) {
                        int intValue = i11.intValue();
                        if (intValue < 0) {
                            intValue = 0;
                        }
                        i9 = intValue;
                    } else {
                        i9 = 0;
                    }
                    Long m10 = AbstractC0863b.m(uVar, "pressDuration", false);
                    long j5 = 1;
                    if (m10 != null) {
                        j = longValue;
                        j5 = AbstractC0832f.i(m10.longValue(), new C1590e(1L, 59999L));
                    } else {
                        j = longValue;
                    }
                    return new C0304c(j, longValue2, i9, str, EnumC0305d.f5582d, enumC0307f2, num4, num, l6, Long.valueOf(j5), num2, num3, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -4096, 31);
                }
            }
        }
        return null;
    }

    public C0304c g(a8.u uVar) {
        H h8;
        H h9;
        String str;
        int i4;
        String str2;
        String str3;
        Long m6 = AbstractC0863b.m(uVar, "id", true);
        if (m6 != null) {
            long longValue = m6.longValue();
            Long m8 = AbstractC0863b.m(uVar, "eventId", true);
            if (m8 != null) {
                long longValue2 = m8.longValue();
                Integer i8 = AbstractC0863b.i(uVar, "notificationImportance", false);
                if (i8 != null) {
                    String p8 = AbstractC0863b.p(uVar, "notificationMessageType", false);
                    if (p8 != null) {
                        try {
                            h8 = H.valueOf(p8);
                        } catch (IllegalArgumentException unused) {
                            h8 = null;
                        }
                        h9 = h8;
                    } else {
                        h9 = null;
                    }
                    if (h9 != null) {
                        String p9 = AbstractC0863b.p(uVar, "name", false);
                        if (p9 == null) {
                            str = "";
                        } else {
                            str = p9;
                        }
                        Integer i9 = AbstractC0863b.i(uVar, "priority", false);
                        if (i9 != null) {
                            int intValue = i9.intValue();
                            if (intValue < 0) {
                                intValue = 0;
                            }
                            i4 = intValue;
                        } else {
                            i4 = 0;
                        }
                        String p10 = AbstractC0863b.p(uVar, "notificationMessageText", false);
                        if (p10 == null) {
                            str2 = "";
                        } else {
                            str2 = p10;
                        }
                        String p11 = AbstractC0863b.p(uVar, "notificationMessageCounterName", false);
                        if (p11 == null) {
                            str3 = "";
                        } else {
                            str3 = p11;
                        }
                        return new C0304c(longValue, longValue2, i4, str, EnumC0305d.j, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, h9, str2, str3, i8, (N) null, (String) null, (Boolean) null, 1073741792, 28);
                    }
                }
            }
        }
        return null;
    }

    public C0304c h(a8.u uVar) {
        int i4;
        Long m6 = AbstractC0863b.m(uVar, "id", true);
        B b4 = null;
        if (m6 != null) {
            long longValue = m6.longValue();
            Long m8 = AbstractC0863b.m(uVar, "eventId", true);
            if (m8 != null) {
                long longValue2 = m8.longValue();
                Boolean f8 = AbstractC0863b.f(uVar, "toggleAll");
                if (f8 != null) {
                    String p8 = AbstractC0863b.p(uVar, "name", false);
                    if (p8 == null) {
                        p8 = "";
                    }
                    String str = p8;
                    Integer i8 = AbstractC0863b.i(uVar, "priority", false);
                    if (i8 != null) {
                        int intValue = i8.intValue();
                        if (intValue < 0) {
                            intValue = 0;
                        }
                        i4 = intValue;
                    } else {
                        i4 = 0;
                    }
                    String p9 = AbstractC0863b.p(uVar, "toggleAllType", false);
                    if (p9 != null) {
                        try {
                            b4 = B.valueOf(p9);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    return new C0304c(longValue, longValue2, i4, str, EnumC0305d.f5586h, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, f8, b4, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -25165856, 31);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:152:0x0354. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0823 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x076a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0702 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0867 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c2  */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0316o i(a8.u uVar) {
        K o7;
        K k;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        C0313l c0313l;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str3;
        Iterator it;
        ArrayList arrayList5;
        x xVar;
        String str4;
        String str5;
        String str6;
        C0310i c0310i;
        String str7;
        EnumC0305d valueOf;
        int i4;
        C0304c c0304c;
        C0304c f8;
        Integer i8;
        Integer i9;
        Integer i10;
        String str8;
        int i11;
        long j;
        String str9;
        int i12;
        long j5;
        String str10;
        int i13;
        boolean z8;
        boolean z9;
        int i14;
        N n3;
        N n8;
        String str11;
        int i15;
        ?? r9;
        ?? r8;
        String str12;
        A a3;
        B b4;
        B b9;
        Long m6;
        F f9;
        G g8;
        G g9;
        String p8;
        String p9;
        String str13;
        int i16;
        String str14;
        boolean z10;
        List list;
        int i17;
        K k6;
        a8.u uVar2;
        String str15;
        Iterator it2;
        T1.r rVar;
        Rect rect;
        String p10;
        String p11;
        String str16;
        Integer i18;
        int i19;
        Boolean f10;
        boolean z11;
        Integer i20;
        int i21;
        int i22;
        Integer i23;
        int i24;
        int i25;
        Z5.j jVar;
        x xVar2;
        int i26;
        boolean z12;
        String str17;
        int i27;
        switch (this.f1750d) {
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                a8.b bVar = a8.b.f8279d;
                bVar.getClass();
                return (C0316o) bVar.a(C0316o.Companion.serializer(), uVar);
            default:
                a8.u l6 = AbstractC0863b.l(uVar, "scenario", false);
                if (l6 != null && (o7 = o(l6)) != null) {
                    a8.d k8 = AbstractC0863b.k(uVar, "events");
                    List list2 = a6.s.f7766d;
                    if (k8 != null) {
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it3 = k8.f8283d.iterator();
                        while (true) {
                            String str18 = "priority";
                            String str19 = "";
                            String str20 = "name";
                            boolean z13 = true;
                            if (it3.hasNext()) {
                                a8.j jVar2 = (a8.j) it3.next();
                                a8.u l8 = AbstractC0863b.l(a8.k.d(jVar2), "event", true);
                                if (l8 != null) {
                                    Long m8 = AbstractC0863b.m(l8, "id", true);
                                    if (m8 != null) {
                                        long longValue = m8.longValue();
                                        Long m9 = AbstractC0863b.m(l8, "scenarioId", true);
                                        if (m9 != null) {
                                            long longValue2 = m9.longValue();
                                            C n9 = n(l8);
                                            if (n9 != null) {
                                                Integer i28 = AbstractC0863b.i(l8, "conditionOperator", false);
                                                if (i28 != null) {
                                                    i26 = AbstractC0832f.f(i28.intValue(), 1, 2);
                                                } else {
                                                    i26 = 1;
                                                }
                                                Boolean f11 = AbstractC0863b.f(l8, "keepDetecting");
                                                if (f11 != null) {
                                                    z12 = f11.booleanValue();
                                                } else {
                                                    z12 = false;
                                                }
                                                String p12 = AbstractC0863b.p(l8, "name", false);
                                                if (p12 == null) {
                                                    str17 = "";
                                                } else {
                                                    str17 = p12;
                                                }
                                                Integer i29 = AbstractC0863b.i(l8, "priority", false);
                                                if (i29 != null) {
                                                    int intValue = i29.intValue();
                                                    if (intValue < 0) {
                                                        intValue = 0;
                                                    }
                                                    i27 = intValue;
                                                } else {
                                                    i27 = 0;
                                                }
                                                Boolean f12 = AbstractC0863b.f(l8, "enabledOnStart");
                                                if (f12 != null) {
                                                    z13 = f12.booleanValue();
                                                }
                                                xVar2 = new x(longValue, longValue2, str17, i26, i27, z13, n9, Boolean.valueOf(z12));
                                                if (xVar2 != null) {
                                                    arrayList6.add(xVar2);
                                                    jVar = new Z5.j(a8.k.d(jVar2), xVar2);
                                                    if (jVar == null) {
                                                        arrayList7.add(jVar);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    xVar2 = null;
                                    if (xVar2 != null) {
                                    }
                                }
                                jVar = null;
                                if (jVar == null) {
                                }
                            } else {
                                ArrayList arrayList8 = new ArrayList();
                                Iterator it4 = arrayList7.iterator();
                                ArrayList arrayList9 = arrayList8;
                                while (it4.hasNext()) {
                                    Z5.j jVar3 = (Z5.j) it4.next();
                                    a8.u uVar3 = (a8.u) jVar3.f7485d;
                                    x xVar3 = (x) jVar3.f7486e;
                                    a8.d k9 = AbstractC0863b.k(uVar3, "conditions");
                                    String str21 = "eventId";
                                    if (k9 != null) {
                                        arrayList = new ArrayList();
                                        Iterator it5 = k9.f8283d.iterator();
                                        while (it5.hasNext()) {
                                            a8.u d2 = a8.k.d((a8.j) it5.next());
                                            T1.s m10 = m(d2);
                                            if (m10 == null) {
                                                list = list2;
                                                i17 = -1;
                                            } else {
                                                list = list2;
                                                i17 = W1.a.f6490a[m10.ordinal()];
                                            }
                                            Iterator it6 = it4;
                                            if (i17 != -1) {
                                                if (i17 != 1) {
                                                    if (i17 != 2) {
                                                        uVar2 = uVar3;
                                                        if (i17 != 3) {
                                                            if (i17 == 4) {
                                                                rVar = l(d2);
                                                                k6 = o7;
                                                                str15 = str19;
                                                                it2 = it5;
                                                            } else {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                        } else {
                                                            Long m11 = AbstractC0863b.m(d2, "id", true);
                                                            if (m11 != null) {
                                                                long longValue3 = m11.longValue();
                                                                Long m12 = AbstractC0863b.m(d2, "eventId", true);
                                                                if (m12 != null) {
                                                                    long longValue4 = m12.longValue();
                                                                    Integer i30 = AbstractC0863b.i(d2, "areaLeft", false);
                                                                    if (i30 != null) {
                                                                        int intValue2 = i30.intValue();
                                                                        str15 = str19;
                                                                        Integer i31 = AbstractC0863b.i(d2, "areaTop", false);
                                                                        if (i31 != null) {
                                                                            int intValue3 = i31.intValue();
                                                                            it2 = it5;
                                                                            Integer i32 = AbstractC0863b.i(d2, "areaRight", false);
                                                                            if (i32 != null) {
                                                                                int intValue4 = i32.intValue();
                                                                                k6 = o7;
                                                                                Integer i33 = AbstractC0863b.i(d2, "areaBottom", false);
                                                                                if (i33 != null) {
                                                                                    rect = new Rect(intValue2, intValue3, intValue4, i33.intValue());
                                                                                    if (rect != null && (p10 = AbstractC0863b.p(d2, "path", true)) != null) {
                                                                                        p11 = AbstractC0863b.p(d2, str20, false);
                                                                                        if (p11 != null) {
                                                                                            str16 = str15;
                                                                                        } else {
                                                                                            str16 = p11;
                                                                                        }
                                                                                        i18 = AbstractC0863b.i(d2, str18, false);
                                                                                        if (i18 == null) {
                                                                                            i19 = i18.intValue();
                                                                                        } else {
                                                                                            i19 = 0;
                                                                                        }
                                                                                        int i34 = rect.left;
                                                                                        int i35 = rect.top;
                                                                                        int i36 = rect.right;
                                                                                        int i37 = rect.bottom;
                                                                                        f10 = AbstractC0863b.f(d2, "shouldBeDetected");
                                                                                        if (f10 == null) {
                                                                                            z11 = f10.booleanValue();
                                                                                        } else {
                                                                                            z11 = true;
                                                                                        }
                                                                                        i20 = AbstractC0863b.i(d2, "detectionType", false);
                                                                                        if (i20 == null) {
                                                                                            i21 = i37;
                                                                                            i22 = AbstractC0832f.f(i20.intValue(), 1, 2);
                                                                                        } else {
                                                                                            i21 = i37;
                                                                                            i22 = 1;
                                                                                        }
                                                                                        i23 = AbstractC0863b.i(d2, "threshold", false);
                                                                                        if (i23 == null) {
                                                                                            i24 = i35;
                                                                                            i25 = AbstractC0832f.f(i23.intValue(), 0, 20);
                                                                                        } else {
                                                                                            i24 = i35;
                                                                                            i25 = 4;
                                                                                        }
                                                                                        rVar = new T1.r(longValue3, longValue4, str16, T1.s.f5638f, i19, p10, Integer.valueOf(i34), Integer.valueOf(i24), Integer.valueOf(i36), Integer.valueOf(i21), Integer.valueOf(i25), Integer.valueOf(i22), Boolean.valueOf(z11), AbstractC0863b.i(d2, "detectionAreaLeft", false), AbstractC0863b.i(d2, "detectionAreaTop", false), AbstractC0863b.i(d2, "detectionAreaRight", false), AbstractC0863b.i(d2, "detectionAreaBottom", false), (String) null, (String) null, (T1.t) null, (T1.u) null, (Integer) null, (String) null, (Long) null, (Boolean) null, 33423360);
                                                                                    }
                                                                                    rVar = null;
                                                                                }
                                                                            } else {
                                                                                k6 = o7;
                                                                            }
                                                                            rect = null;
                                                                            if (rect != null) {
                                                                                p11 = AbstractC0863b.p(d2, str20, false);
                                                                                if (p11 != null) {
                                                                                }
                                                                                i18 = AbstractC0863b.i(d2, str18, false);
                                                                                if (i18 == null) {
                                                                                }
                                                                                int i342 = rect.left;
                                                                                int i352 = rect.top;
                                                                                int i362 = rect.right;
                                                                                int i372 = rect.bottom;
                                                                                f10 = AbstractC0863b.f(d2, "shouldBeDetected");
                                                                                if (f10 == null) {
                                                                                }
                                                                                i20 = AbstractC0863b.i(d2, "detectionType", false);
                                                                                if (i20 == null) {
                                                                                }
                                                                                i23 = AbstractC0863b.i(d2, "threshold", false);
                                                                                if (i23 == null) {
                                                                                }
                                                                                rVar = new T1.r(longValue3, longValue4, str16, T1.s.f5638f, i19, p10, Integer.valueOf(i342), Integer.valueOf(i24), Integer.valueOf(i362), Integer.valueOf(i21), Integer.valueOf(i25), Integer.valueOf(i22), Boolean.valueOf(z11), AbstractC0863b.i(d2, "detectionAreaLeft", false), AbstractC0863b.i(d2, "detectionAreaTop", false), AbstractC0863b.i(d2, "detectionAreaRight", false), AbstractC0863b.i(d2, "detectionAreaBottom", false), (String) null, (String) null, (T1.t) null, (T1.u) null, (Integer) null, (String) null, (Long) null, (Boolean) null, 33423360);
                                                                            }
                                                                            rVar = null;
                                                                        } else {
                                                                            k6 = o7;
                                                                        }
                                                                    } else {
                                                                        k6 = o7;
                                                                        str15 = str19;
                                                                    }
                                                                    it2 = it5;
                                                                    rect = null;
                                                                    if (rect != null) {
                                                                    }
                                                                    rVar = null;
                                                                }
                                                            }
                                                            k6 = o7;
                                                        }
                                                    } else {
                                                        k6 = o7;
                                                        uVar2 = uVar3;
                                                        str15 = str19;
                                                        it2 = it5;
                                                        rVar = k(d2);
                                                    }
                                                } else {
                                                    k6 = o7;
                                                    uVar2 = uVar3;
                                                    str15 = str19;
                                                    it2 = it5;
                                                    rVar = j(d2);
                                                }
                                                if (rVar == null) {
                                                    arrayList.add(rVar);
                                                }
                                                it4 = it6;
                                                list2 = list;
                                                uVar3 = uVar2;
                                                str19 = str15;
                                                it5 = it2;
                                                o7 = k6;
                                            } else {
                                                k6 = o7;
                                                uVar2 = uVar3;
                                            }
                                            str15 = str19;
                                            it2 = it5;
                                            rVar = null;
                                            if (rVar == null) {
                                            }
                                            it4 = it6;
                                            list2 = list;
                                            uVar3 = uVar2;
                                            str19 = str15;
                                            it5 = it2;
                                            o7 = k6;
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    K k10 = o7;
                                    List list3 = list2;
                                    Iterator it7 = it4;
                                    a8.u uVar4 = uVar3;
                                    String str22 = str19;
                                    String str23 = "DeserializerCompat";
                                    if (arrayList == null || arrayList.isEmpty()) {
                                        arrayList2 = arrayList9;
                                        str = str18;
                                        str2 = str20;
                                        Log.w("DeserializerCompat", "There is no conditions in this event");
                                    } else {
                                        a8.d k11 = AbstractC0863b.k(a8.k.d(uVar4), "actions");
                                        if (k11 != null) {
                                            arrayList3 = new ArrayList();
                                            Iterator it8 = k11.f8283d.iterator();
                                            ArrayList arrayList10 = arrayList9;
                                            while (it8.hasNext()) {
                                                a8.u d3 = a8.k.d((a8.j) it8.next());
                                                int i38 = xVar3.f5655d;
                                                a8.u l9 = AbstractC0863b.l(d3, "action", false);
                                                if (l9 != null) {
                                                    arrayList4 = arrayList10;
                                                    it = it8;
                                                    String p13 = AbstractC0863b.p(l9, "type", true);
                                                    xVar = xVar3;
                                                    arrayList5 = arrayList3;
                                                    if (p13 != null) {
                                                        try {
                                                            valueOf = EnumC0305d.valueOf(p13);
                                                            str7 = str23;
                                                        } catch (IllegalArgumentException unused) {
                                                            str7 = str23;
                                                            Log.w("JsonObject", "Can't create IntentExtraType, value " + p13 + " is invalid");
                                                        }
                                                        if (valueOf != null) {
                                                            i4 = -1;
                                                        } else {
                                                            i4 = W1.a.f6491b[valueOf.ordinal()];
                                                        }
                                                        switch (i4) {
                                                            case -1:
                                                                str3 = str21;
                                                                str4 = str18;
                                                                str5 = str20;
                                                                c0304c = null;
                                                                if (c0304c == null) {
                                                                    str6 = str7;
                                                                    break;
                                                                } else {
                                                                    a8.d k12 = AbstractC0863b.k(d3, "intentExtras");
                                                                    if (k12 != null) {
                                                                        r9 = new ArrayList();
                                                                        Iterator it9 = k12.f8283d.iterator();
                                                                        while (it9.hasNext()) {
                                                                            a8.u d9 = a8.k.d((a8.j) it9.next());
                                                                            Long m13 = AbstractC0863b.m(d9, "id", true);
                                                                            if (m13 != null) {
                                                                                long longValue5 = m13.longValue();
                                                                                Long m14 = AbstractC0863b.m(d9, "actionId", true);
                                                                                if (m14 != null) {
                                                                                    long longValue6 = m14.longValue();
                                                                                    String p14 = AbstractC0863b.p(d9, "type", true);
                                                                                    if (p14 != null) {
                                                                                        try {
                                                                                            g8 = G.valueOf(p14);
                                                                                        } catch (IllegalArgumentException unused2) {
                                                                                            Log.w("JsonObject", "Can't create IntentExtraType, value " + p14 + " is invalid");
                                                                                            g8 = null;
                                                                                        }
                                                                                        g9 = g8;
                                                                                    } else {
                                                                                        g9 = null;
                                                                                    }
                                                                                    if (g9 != null && (p8 = AbstractC0863b.p(d9, "key", true)) != null && (p9 = AbstractC0863b.p(d9, "value", true)) != null) {
                                                                                        f9 = new F(longValue5, longValue6, g9, p8, p9);
                                                                                        if (f9 == null) {
                                                                                            r9.add(f9);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            f9 = null;
                                                                            if (f9 == null) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        r9 = list3;
                                                                    }
                                                                    a8.d k13 = AbstractC0863b.k(d3, "eventsToggle");
                                                                    if (k13 != null) {
                                                                        r8 = new ArrayList();
                                                                        Iterator it10 = k13.f8283d.iterator();
                                                                        while (it10.hasNext()) {
                                                                            a8.u d10 = a8.k.d((a8.j) it10.next());
                                                                            Long m15 = AbstractC0863b.m(d10, "id", true);
                                                                            if (m15 != null) {
                                                                                long longValue7 = m15.longValue();
                                                                                Long m16 = AbstractC0863b.m(d10, "actionId", true);
                                                                                if (m16 != null) {
                                                                                    long longValue8 = m16.longValue();
                                                                                    String p15 = AbstractC0863b.p(d10, "type", true);
                                                                                    if (p15 != null) {
                                                                                        try {
                                                                                            b4 = B.valueOf(p15);
                                                                                        } catch (IllegalArgumentException unused3) {
                                                                                            Log.w("JsonObject", "Can't create IntentExtraType, value " + p15 + " is invalid");
                                                                                            b4 = null;
                                                                                        }
                                                                                        b9 = b4;
                                                                                    } else {
                                                                                        b9 = null;
                                                                                    }
                                                                                    if (b9 != null && (m6 = AbstractC0863b.m(d10, "toggleEventId", true)) != null) {
                                                                                        long longValue9 = m6.longValue();
                                                                                        if (!h7.u.a(arrayList6, longValue9)) {
                                                                                            String str24 = str7;
                                                                                            Log.w(str24, "Can't deserialize event toggle, toggleEventId is not valid.");
                                                                                            str12 = str24;
                                                                                            a3 = null;
                                                                                            if (a3 != null) {
                                                                                                r8.add(a3);
                                                                                            }
                                                                                            str7 = str12;
                                                                                        } else {
                                                                                            str12 = str7;
                                                                                            a3 = new A(longValue7, longValue8, b9, longValue9);
                                                                                            if (a3 != null) {
                                                                                            }
                                                                                            str7 = str12;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            str12 = str7;
                                                                            a3 = null;
                                                                            if (a3 != null) {
                                                                            }
                                                                            str7 = str12;
                                                                        }
                                                                    } else {
                                                                        r8 = list3;
                                                                    }
                                                                    str6 = str7;
                                                                    c0310i = new C0310i(c0304c, r9, r8);
                                                                    ArrayList arrayList11 = arrayList5;
                                                                    if (c0310i == null) {
                                                                        arrayList11.add(c0310i);
                                                                    }
                                                                    arrayList3 = arrayList11;
                                                                    str23 = str6;
                                                                    str21 = str3;
                                                                    it8 = it;
                                                                    arrayList10 = arrayList4;
                                                                    xVar3 = xVar;
                                                                    str18 = str4;
                                                                    str20 = str5;
                                                                }
                                                                break;
                                                            case 0:
                                                            default:
                                                                throw new NoWhenBranchMatchedException();
                                                            case 1:
                                                                str3 = str21;
                                                                str4 = str18;
                                                                str5 = str20;
                                                                f8 = f(l9, arrayList, i38);
                                                                c0304c = f8;
                                                                if (c0304c == null) {
                                                                }
                                                                break;
                                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                                Long m17 = AbstractC0863b.m(l9, "id", true);
                                                                if (m17 != null) {
                                                                    long longValue10 = m17.longValue();
                                                                    Long m18 = AbstractC0863b.m(l9, str21, true);
                                                                    if (m18 != null) {
                                                                        long longValue11 = m18.longValue();
                                                                        Integer i39 = AbstractC0863b.i(l9, "fromX", true);
                                                                        if (i39 != null && (i8 = AbstractC0863b.i(l9, "fromY", true)) != null && (i9 = AbstractC0863b.i(l9, "toX", true)) != null && (i10 = AbstractC0863b.i(l9, "toY", true)) != null) {
                                                                            String p16 = AbstractC0863b.p(l9, str20, false);
                                                                            if (p16 == null) {
                                                                                str8 = str22;
                                                                            } else {
                                                                                str8 = p16;
                                                                            }
                                                                            Integer i40 = AbstractC0863b.i(l9, str18, false);
                                                                            if (i40 != null) {
                                                                                int intValue5 = i40.intValue();
                                                                                if (intValue5 < 0) {
                                                                                    intValue5 = 0;
                                                                                }
                                                                                i11 = intValue5;
                                                                            } else {
                                                                                i11 = 0;
                                                                            }
                                                                            Long m19 = AbstractC0863b.m(l9, "swipeDuration", false);
                                                                            if (m19 != null) {
                                                                                str3 = str21;
                                                                                str4 = str18;
                                                                                str5 = str20;
                                                                                j = AbstractC0832f.i(m19.longValue(), new C1590e(1L, 59999L));
                                                                            } else {
                                                                                str3 = str21;
                                                                                str4 = str18;
                                                                                str5 = str20;
                                                                                j = 250;
                                                                            }
                                                                            f8 = new C0304c(longValue10, longValue11, i11, str8, EnumC0305d.f5583e, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, i39, i8, i9, i10, Long.valueOf(j), (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -127008, 31);
                                                                            c0304c = f8;
                                                                            if (c0304c == null) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                str3 = str21;
                                                                str4 = str18;
                                                                str5 = str20;
                                                                f8 = null;
                                                                c0304c = f8;
                                                                if (c0304c == null) {
                                                                }
                                                                break;
                                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                                Long m20 = AbstractC0863b.m(l9, "id", true);
                                                                if (m20 != null) {
                                                                    long longValue12 = m20.longValue();
                                                                    Long m21 = AbstractC0863b.m(l9, str21, true);
                                                                    if (m21 != null) {
                                                                        long longValue13 = m21.longValue();
                                                                        String p17 = AbstractC0863b.p(l9, str20, false);
                                                                        if (p17 == null) {
                                                                            str9 = str22;
                                                                        } else {
                                                                            str9 = p17;
                                                                        }
                                                                        Integer i41 = AbstractC0863b.i(l9, str18, false);
                                                                        if (i41 != null) {
                                                                            int intValue6 = i41.intValue();
                                                                            if (intValue6 < 0) {
                                                                                intValue6 = 0;
                                                                            }
                                                                            i12 = intValue6;
                                                                        } else {
                                                                            i12 = 0;
                                                                        }
                                                                        Long m22 = AbstractC0863b.m(l9, "pauseDuration", false);
                                                                        if (m22 != null) {
                                                                            j5 = m22.longValue();
                                                                            if (j5 < 0) {
                                                                                j5 = 0;
                                                                            }
                                                                        } else {
                                                                            j5 = 50;
                                                                        }
                                                                        f8 = new C0304c(longValue12, longValue13, i12, str9, EnumC0305d.f5584f, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, Long.valueOf(j5), (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -131104, 31);
                                                                        str3 = str21;
                                                                        str4 = str18;
                                                                        str5 = str20;
                                                                        c0304c = f8;
                                                                        if (c0304c == null) {
                                                                        }
                                                                    }
                                                                }
                                                                f8 = null;
                                                                str3 = str21;
                                                                str4 = str18;
                                                                str5 = str20;
                                                                c0304c = f8;
                                                                if (c0304c == null) {
                                                                }
                                                                break;
                                                            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                                                Long m23 = AbstractC0863b.m(l9, "id", true);
                                                                if (m23 != null) {
                                                                    long longValue14 = m23.longValue();
                                                                    Long m24 = AbstractC0863b.m(l9, str21, true);
                                                                    if (m24 != null) {
                                                                        long longValue15 = m24.longValue();
                                                                        String p18 = AbstractC0863b.p(l9, "intentAction", true);
                                                                        if (p18 != null) {
                                                                            String p19 = AbstractC0863b.p(l9, str20, false);
                                                                            if (p19 == null) {
                                                                                str10 = str22;
                                                                            } else {
                                                                                str10 = p19;
                                                                            }
                                                                            Integer i42 = AbstractC0863b.i(l9, str18, false);
                                                                            if (i42 != null) {
                                                                                int intValue7 = i42.intValue();
                                                                                if (intValue7 < 0) {
                                                                                    intValue7 = 0;
                                                                                }
                                                                                i13 = intValue7;
                                                                            } else {
                                                                                i13 = 0;
                                                                            }
                                                                            Boolean f13 = AbstractC0863b.f(l9, "isAdvanced");
                                                                            if (f13 != null) {
                                                                                z8 = f13.booleanValue();
                                                                            } else {
                                                                                z8 = false;
                                                                            }
                                                                            Boolean f14 = AbstractC0863b.f(l9, "isBroadcast");
                                                                            if (f14 != null) {
                                                                                z9 = f14.booleanValue();
                                                                            } else {
                                                                                z9 = false;
                                                                            }
                                                                            boolean z14 = z8;
                                                                            String p20 = AbstractC0863b.p(l9, "componentName", false);
                                                                            Integer i43 = AbstractC0863b.i(l9, "flags", false);
                                                                            if (i43 == null || (i14 = i43.intValue()) < 0) {
                                                                                i14 = 0;
                                                                            }
                                                                            f8 = new C0304c(longValue14, longValue15, i13, str10, EnumC0305d.f5585g, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, Boolean.valueOf(z14), Boolean.valueOf(z9), p18, p20, Integer.valueOf(i14), (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -8126496, 31);
                                                                            str3 = str21;
                                                                            str4 = str18;
                                                                            str5 = str20;
                                                                            c0304c = f8;
                                                                            if (c0304c == null) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                f8 = null;
                                                                str3 = str21;
                                                                str4 = str18;
                                                                str5 = str20;
                                                                c0304c = f8;
                                                                if (c0304c == null) {
                                                                }
                                                                break;
                                                            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                                                f8 = h(l9);
                                                                str3 = str21;
                                                                str4 = str18;
                                                                str5 = str20;
                                                                c0304c = f8;
                                                                if (c0304c == null) {
                                                                }
                                                                break;
                                                            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                f8 = e(l9);
                                                                str3 = str21;
                                                                str4 = str18;
                                                                str5 = str20;
                                                                c0304c = f8;
                                                                if (c0304c == null) {
                                                                }
                                                                break;
                                                            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                f8 = g(l9);
                                                                str3 = str21;
                                                                str4 = str18;
                                                                str5 = str20;
                                                                c0304c = f8;
                                                                if (c0304c == null) {
                                                                }
                                                                break;
                                                            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                Long m25 = AbstractC0863b.m(l9, "id", true);
                                                                if (m25 != null) {
                                                                    long longValue16 = m25.longValue();
                                                                    Long m26 = AbstractC0863b.m(l9, str21, true);
                                                                    if (m26 != null) {
                                                                        long longValue17 = m26.longValue();
                                                                        String p21 = AbstractC0863b.p(l9, "systemActionType", false);
                                                                        if (p21 != null) {
                                                                            try {
                                                                                n3 = N.valueOf(p21);
                                                                            } catch (IllegalArgumentException unused4) {
                                                                                n3 = null;
                                                                            }
                                                                            n8 = n3;
                                                                        } else {
                                                                            n8 = null;
                                                                        }
                                                                        if (n8 != null) {
                                                                            String p22 = AbstractC0863b.p(l9, str20, false);
                                                                            if (p22 == null) {
                                                                                str11 = str22;
                                                                            } else {
                                                                                str11 = p22;
                                                                            }
                                                                            Integer i44 = AbstractC0863b.i(l9, str18, false);
                                                                            if (i44 != null) {
                                                                                int intValue8 = i44.intValue();
                                                                                if (intValue8 < 0) {
                                                                                    intValue8 = 0;
                                                                                }
                                                                                i15 = intValue8;
                                                                            } else {
                                                                                i15 = 0;
                                                                            }
                                                                            f8 = new C0304c(longValue16, longValue17, i15, str11, EnumC0305d.k, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, n8, (String) null, (Boolean) null, -32, 27);
                                                                            str3 = str21;
                                                                            str4 = str18;
                                                                            str5 = str20;
                                                                            c0304c = f8;
                                                                            if (c0304c == null) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                f8 = null;
                                                                str3 = str21;
                                                                str4 = str18;
                                                                str5 = str20;
                                                                c0304c = f8;
                                                                if (c0304c == null) {
                                                                }
                                                                break;
                                                            case 9:
                                                                Long m27 = AbstractC0863b.m(l9, "id", true);
                                                                if (m27 != null) {
                                                                    long longValue18 = m27.longValue();
                                                                    Long m28 = AbstractC0863b.m(l9, str21, true);
                                                                    if (m28 != null) {
                                                                        long longValue19 = m28.longValue();
                                                                        String p23 = AbstractC0863b.p(l9, str20, false);
                                                                        if (p23 == null) {
                                                                            str13 = str22;
                                                                        } else {
                                                                            str13 = p23;
                                                                        }
                                                                        Integer i45 = AbstractC0863b.i(l9, str18, false);
                                                                        if (i45 != null) {
                                                                            int intValue9 = i45.intValue();
                                                                            if (intValue9 < 0) {
                                                                                intValue9 = 0;
                                                                            }
                                                                            i16 = intValue9;
                                                                        } else {
                                                                            i16 = 0;
                                                                        }
                                                                        String p24 = AbstractC0863b.p(l9, "textValue", false);
                                                                        if (p24 == null) {
                                                                            str14 = str22;
                                                                        } else {
                                                                            str14 = p24;
                                                                        }
                                                                        Boolean f15 = AbstractC0863b.f(l9, "textValidateInput");
                                                                        if (f15 != null) {
                                                                            z10 = f15.booleanValue();
                                                                        } else {
                                                                            z10 = false;
                                                                        }
                                                                        f8 = new C0304c(longValue18, longValue19, i16, str13, EnumC0305d.f5588l, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, str14, Boolean.valueOf(z10), -32, 7);
                                                                        str3 = str21;
                                                                        str4 = str18;
                                                                        str5 = str20;
                                                                        c0304c = f8;
                                                                        if (c0304c == null) {
                                                                        }
                                                                    }
                                                                }
                                                                f8 = null;
                                                                str3 = str21;
                                                                str4 = str18;
                                                                str5 = str20;
                                                                c0304c = f8;
                                                                if (c0304c == null) {
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        str7 = str23;
                                                    }
                                                    valueOf = null;
                                                    if (valueOf != null) {
                                                    }
                                                    switch (i4) {
                                                    }
                                                } else {
                                                    arrayList4 = arrayList10;
                                                    str3 = str21;
                                                    it = it8;
                                                    arrayList5 = arrayList3;
                                                    xVar = xVar3;
                                                    str4 = str18;
                                                    str5 = str20;
                                                    str6 = str23;
                                                }
                                                c0310i = null;
                                                ArrayList arrayList112 = arrayList5;
                                                if (c0310i == null) {
                                                }
                                                arrayList3 = arrayList112;
                                                str23 = str6;
                                                str21 = str3;
                                                it8 = it;
                                                arrayList10 = arrayList4;
                                                xVar3 = xVar;
                                                str18 = str4;
                                                str20 = str5;
                                            }
                                            arrayList2 = arrayList10;
                                        } else {
                                            arrayList2 = arrayList9;
                                            arrayList3 = null;
                                        }
                                        x xVar4 = xVar3;
                                        str = str18;
                                        str2 = str20;
                                        String str25 = str23;
                                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                                            c0313l = new C0313l(xVar4, arrayList3, arrayList);
                                            ArrayList arrayList12 = arrayList2;
                                            if (c0313l == null) {
                                                arrayList12.add(c0313l);
                                            }
                                            arrayList9 = arrayList12;
                                            it4 = it7;
                                            list2 = list3;
                                            str18 = str;
                                            str20 = str2;
                                            str19 = str22;
                                            o7 = k10;
                                        } else {
                                            Log.w(str25, "Can't deserialize this complete event, there is no actions");
                                        }
                                    }
                                    c0313l = null;
                                    ArrayList arrayList122 = arrayList2;
                                    if (c0313l == null) {
                                    }
                                    arrayList9 = arrayList122;
                                    it4 = it7;
                                    list2 = list3;
                                    str18 = str;
                                    str20 = str2;
                                    str19 = str22;
                                    o7 = k10;
                                }
                                k = o7;
                                list2 = arrayList9;
                            }
                        }
                    } else {
                        k = o7;
                    }
                    return new C0316o(k, list2);
                }
                throw new IllegalArgumentException("Json CompleteScenario doesn't contains a valid Scenario");
        }
    }

    public T1.r j(a8.u uVar) {
        Long m6 = AbstractC0863b.m(uVar, "id", true);
        if (m6 != null) {
            long longValue = m6.longValue();
            Long m8 = AbstractC0863b.m(uVar, "eventId", true);
            if (m8 != null) {
                long longValue2 = m8.longValue();
                String p8 = AbstractC0863b.p(uVar, "broadcastAction", false);
                if (p8 != null) {
                    String p9 = AbstractC0863b.p(uVar, "name", false);
                    if (p9 == null) {
                        p9 = "";
                    }
                    return new T1.r(longValue, longValue2, p9, T1.s.f5636d, 0, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, p8, (String) null, (T1.t) null, (T1.u) null, (Integer) null, (String) null, (Long) null, (Boolean) null, 33423328);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public T1.r k(a8.u uVar) {
        T1.t tVar;
        T1.t tVar2;
        int i4;
        String str;
        String str2;
        Long m6 = AbstractC0863b.m(uVar, "id", true);
        T1.u uVar2 = null;
        if (m6 != null) {
            long longValue = m6.longValue();
            Long m8 = AbstractC0863b.m(uVar, "eventId", true);
            if (m8 != null) {
                long longValue2 = m8.longValue();
                String p8 = AbstractC0863b.p(uVar, "counterName", false);
                if (p8 != null) {
                    String p9 = AbstractC0863b.p(uVar, "counterComparisonOperation", false);
                    if (p9 != null) {
                        try {
                            tVar = T1.t.valueOf(p9);
                        } catch (IllegalArgumentException unused) {
                            tVar = null;
                        }
                        tVar2 = tVar;
                    } else {
                        tVar2 = null;
                    }
                    if (tVar2 != null) {
                        String p10 = AbstractC0863b.p(uVar, "counterOperationValueType", false);
                        if (p10 != null) {
                            try {
                                uVar2 = T1.u.valueOf(p10);
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                        if (uVar2 == null) {
                            uVar2 = T1.u.f5647d;
                        }
                        T1.u uVar3 = uVar2;
                        Integer i8 = AbstractC0863b.i(uVar, "counterValue", false);
                        if (i8 != null) {
                            i4 = i8.intValue();
                        } else {
                            i4 = 0;
                        }
                        String p11 = AbstractC0863b.p(uVar, "counterOperationCounterName", false);
                        if (p11 == null) {
                            str = "";
                        } else {
                            str = p11;
                        }
                        String p12 = AbstractC0863b.p(uVar, "name", false);
                        if (p12 == null) {
                            str2 = "";
                        } else {
                            str2 = p12;
                        }
                        return new T1.r(longValue, longValue2, str2, T1.s.f5637e, 0, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, p8, tVar2, uVar3, Integer.valueOf(i4), str, (Long) null, (Boolean) null, 25427936);
                    }
                }
            }
        }
        return null;
    }

    public T1.r l(a8.u uVar) {
        Boolean f8;
        Long m6 = AbstractC0863b.m(uVar, "id", true);
        if (m6 != null) {
            long longValue = m6.longValue();
            Long m8 = AbstractC0863b.m(uVar, "eventId", true);
            if (m8 != null) {
                long longValue2 = m8.longValue();
                Long m9 = AbstractC0863b.m(uVar, "timerValueMs", false);
                if (m9 != null && (f8 = AbstractC0863b.f(uVar, "restartWhenReached")) != null) {
                    String p8 = AbstractC0863b.p(uVar, "name", false);
                    if (p8 == null) {
                        p8 = "";
                    }
                    return new T1.r(longValue, longValue2, p8, T1.s.f5639g, 0, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (T1.t) null, (T1.u) null, (Integer) null, (String) null, m9, f8, 8388576);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public T1.s m(a8.u uVar) {
        String p8 = AbstractC0863b.p(uVar, "type", true);
        if (p8 != null) {
            try {
                return T1.s.valueOf(p8);
            } catch (IllegalArgumentException unused) {
                Log.w("JsonObject", "Can't create IntentExtraType, value " + p8 + " is invalid");
            }
        }
        return null;
    }

    public C n(a8.u uVar) {
        String p8 = AbstractC0863b.p(uVar, "type", true);
        if (p8 != null) {
            try {
                return C.valueOf(p8);
            } catch (IllegalArgumentException unused) {
                Log.w("JsonObject", "Can't create IntentExtraType, value " + p8 + " is invalid");
            }
        }
        return null;
    }

    public K o(a8.u uVar) {
        boolean z8;
        Long m6 = AbstractC0863b.m(uVar, "id", true);
        if (m6 != null) {
            long longValue = m6.longValue();
            int f8 = AbstractC0832f.f(p(uVar), 400, 10000);
            boolean z9 = false;
            String p8 = AbstractC0863b.p(uVar, "name", false);
            if (p8 == null) {
                p8 = "";
            }
            Boolean f9 = AbstractC0863b.f(uVar, "randomize");
            if (f9 != null) {
                z8 = f9.booleanValue();
            } else {
                z8 = false;
            }
            Boolean f10 = AbstractC0863b.f(uVar, "keepScreenOn");
            if (f10 != null) {
                z9 = f10.booleanValue();
            }
            return new K(longValue, p8, f8, z8, z9);
        }
        return null;
    }

    public int p(a8.u uVar) {
        Integer i4 = AbstractC0863b.i(uVar, "detectionQuality", false);
        if (i4 != null) {
            return i4.intValue();
        }
        return 1200;
    }

    public boolean q() {
        return this instanceof f;
    }

    public void r(float f8, float f9, float f10, v vVar) {
        vVar.c(f8, 0.0f);
    }

    public Signature[] t(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void v(R3.r rVar, float f8) {
        C1475a c1475a = (C1475a) ((Drawable) rVar.f5082e);
        CardView cardView = (CardView) rVar.f5083f;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f8 != c1475a.f14437e || c1475a.f14438f != useCompatPadding || c1475a.f14439g != preventCornerOverlap) {
            c1475a.f14437e = f8;
            c1475a.f14438f = useCompatPadding;
            c1475a.f14439g = preventCornerOverlap;
            c1475a.b(null);
            c1475a.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            rVar.a0(0, 0, 0, 0);
            return;
        }
        C1475a c1475a2 = (C1475a) ((Drawable) rVar.f5082e);
        float f9 = c1475a2.f14437e;
        float f10 = c1475a2.f14433a;
        int ceil = (int) Math.ceil(AbstractC1476b.a(f9, f10, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(AbstractC1476b.b(f9, f10, cardView.getPreventCornerOverlap()));
        rVar.a0(ceil, ceil2, ceil, ceil2);
    }

    public e(v7.k kVar) {
        this.f1750d = 24;
        String str = v7.k.f15559d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public e(View view) {
        this.f1750d = 6;
        if (Build.VERSION.SDK_INT >= 30) {
            new C1594d(view);
        } else {
            new C1594d(view);
        }
    }

    @Override // r0.d
    public void E(int i4, Object obj) {
    }

    @Override // P.InterfaceC0271t
    public void onScrollLimit(int i4, int i8, int i9, boolean z8) {
    }

    @Override // P.InterfaceC0271t
    public void onScrollProgress(int i4, int i8, int i9, int i10) {
    }
}
