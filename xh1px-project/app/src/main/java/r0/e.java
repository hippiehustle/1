package r0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final G5.e f14239a = new G5.e(25);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f14240b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f14241c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f14242d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f14243e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f14244f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f14245g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f14246h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f14247i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) {
        int i4 = 0;
        int i8 = 0;
        for (c cVar : cVarArr) {
            i8 += ((((cVar.f14236g * 2) + 7) & (-8)) / 8) + (cVar.f14234e * 2) + d(cVar.f14230a, cVar.f14231b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f14235f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i8);
        if (Arrays.equals(bArr, f14244f)) {
            int length = cVarArr.length;
            while (i4 < length) {
                c cVar2 = cVarArr[i4];
                q(byteArrayOutputStream, cVar2, d(cVar2.f14230a, cVar2.f14231b, bArr));
                p(byteArrayOutputStream, cVar2);
                i4++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(cVar3.f14230a, cVar3.f14231b, bArr));
            }
            int length2 = cVarArr.length;
            while (i4 < length2) {
                p(byteArrayOutputStream, cVarArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == i8) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i8);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z8 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            return z8;
        }
        file.delete();
        return true;
    }

    public static String d(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = f14246h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f14245g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    StringBuilder a3 = AbstractC1769h.a(str);
                    if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                        str3 = ":";
                    }
                    return A.j.r(a3, str3, str2);
                }
            } else {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i4) {
        byte[] bArr = new byte[i4];
        int i8 = 0;
        while (i8 < i4) {
            int read = inputStream.read(bArr, i8, i4 - i8);
            if (read >= 0) {
                i8 += read;
            } else {
                throw new IllegalStateException(A.j.l("Not enough bytes to read: ", i4));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i4) {
        int[] iArr = new int[i4];
        int i8 = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            i8 += (int) m(byteArrayInputStream, 2);
            iArr[i9] = i8;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] h(FileInputStream fileInputStream, int i4, int i8) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i8];
            byte[] bArr2 = new byte[2048];
            int i9 = 0;
            int i10 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i9 < i4) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    try {
                        i10 += inflater.inflate(bArr, i10, i8 - i10);
                        i9 += read;
                    } catch (DataFormatException e9) {
                        throw new IllegalStateException(e9.getMessage());
                    }
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i4 + " bytes");
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i4 + " actual=" + i9);
        } finally {
            inflater.end();
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f14247i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f14242d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m6 = (int) m(fileInputStream, 1);
                    byte[] h8 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h8);
                        try {
                            c[] j5 = j(byteArrayInputStream, m6, cVarArr);
                            byteArrayInputStream.close();
                            return j5;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, j)) {
            int m8 = (int) m(fileInputStream, 2);
            byte[] h9 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h9);
                try {
                    c[] k = k(byteArrayInputStream2, bArr2, m8, cVarArr);
                    byteArrayInputStream2.close();
                    return k;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i4, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i4 == cVarArr.length) {
            String[] strArr = new String[i4];
            int[] iArr = new int[i4];
            for (int i8 = 0; i8 < i4; i8++) {
                int m6 = (int) m(byteArrayInputStream, 2);
                iArr[i8] = (int) m(byteArrayInputStream, 2);
                strArr[i8] = new String(f(byteArrayInputStream, m6), StandardCharsets.UTF_8);
            }
            for (int i9 = 0; i9 < i4; i9++) {
                c cVar = cVarArr[i9];
                if (cVar.f14231b.equals(strArr[i9])) {
                    int i10 = iArr[i9];
                    cVar.f14234e = i10;
                    cVar.f14237h = g(byteArrayInputStream, i10);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i4, c[] cVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i4 == cVarArr.length) {
            for (int i8 = 0; i8 < i4; i8++) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m6 = m(byteArrayInputStream, 4);
                int m8 = (int) m(byteArrayInputStream, 2);
                c cVar = null;
                if (cVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i9 = 0;
                    while (true) {
                        if (i9 >= cVarArr.length) {
                            break;
                        }
                        if (cVarArr[i9].f14231b.equals(str)) {
                            cVar = cVarArr[i9];
                            break;
                        }
                        i9++;
                    }
                }
                if (cVar != null) {
                    cVar.f14233d = m6;
                    int[] g8 = g(byteArrayInputStream, m8);
                    if (Arrays.equals(bArr, f14246h)) {
                        cVar.f14234e = m8;
                        cVar.f14237h = g8;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f14243e)) {
            int m6 = (int) m(fileInputStream, 1);
            byte[] h8 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h8);
                try {
                    c[] n3 = n(byteArrayInputStream, str, m6);
                    byteArrayInputStream.close();
                    return n3;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static long m(InputStream inputStream, int i4) {
        byte[] f8 = f(inputStream, i4);
        long j5 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            j5 += (f8[i8] & 255) << (i8 * 8);
        }
        return j5;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i4) {
        int i8;
        int i9 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i4];
        for (int i10 = 0; i10 < i4; i10++) {
            int m6 = (int) m(byteArrayInputStream, 2);
            int m8 = (int) m(byteArrayInputStream, 2);
            cVarArr[i10] = new c(str, new String(f(byteArrayInputStream, m6), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m8, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m8], new TreeMap());
        }
        int i11 = 0;
        while (i11 < i4) {
            c cVar = cVarArr[i11];
            int available = byteArrayInputStream.available();
            int i12 = cVar.f14235f;
            int i13 = cVar.f14236g;
            TreeMap treeMap = cVar.f14238i;
            int i14 = available - i12;
            int i15 = i9;
            while (byteArrayInputStream.available() > i14) {
                i15 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i15), 1);
                int m9 = (int) m(byteArrayInputStream, 2);
                while (m9 > 0) {
                    m(byteArrayInputStream, 2);
                    int m10 = (int) m(byteArrayInputStream, 1);
                    if (m10 != 6 && m10 != 7) {
                        while (m10 > 0) {
                            m(byteArrayInputStream, 1);
                            int i16 = i9;
                            int i17 = i11;
                            for (int m11 = (int) m(byteArrayInputStream, 1); m11 > 0; m11--) {
                                m(byteArrayInputStream, 2);
                            }
                            m10--;
                            i9 = i16;
                            i11 = i17;
                        }
                    }
                    m9--;
                    i9 = i9;
                    i11 = i11;
                }
            }
            int i18 = i9;
            int i19 = i11;
            if (byteArrayInputStream.available() == i14) {
                cVar.f14237h = g(byteArrayInputStream, cVar.f14234e);
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i13 * 2) + 7) & (-8)) / 8));
                for (int i20 = i18; i20 < i13; i20++) {
                    if (valueOf.get(i20)) {
                        i8 = 2;
                    } else {
                        i8 = i18;
                    }
                    if (valueOf.get(i20 + i13)) {
                        i8 |= 4;
                    }
                    if (i8 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i20));
                        if (num == null) {
                            num = Integer.valueOf(i18);
                        }
                        treeMap.put(Integer.valueOf(i20), Integer.valueOf(i8 | num.intValue()));
                    }
                }
                i11 = i19 + 1;
                i9 = i18;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        long j5;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f14242d;
        int i4 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                v(byteArrayOutputStream2, cVarArr.length);
                int i8 = 2;
                int i9 = 2;
                for (c cVar : cVarArr) {
                    u(byteArrayOutputStream2, cVar.f14232c, 4);
                    u(byteArrayOutputStream2, cVar.f14233d, 4);
                    u(byteArrayOutputStream2, cVar.f14236g, 4);
                    String d2 = d(cVar.f14230a, cVar.f14231b, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d2.getBytes(charset).length;
                    v(byteArrayOutputStream2, length2);
                    i9 = i9 + 14 + length2;
                    byteArrayOutputStream2.write(d2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i9 == byteArray.length) {
                    j jVar = new j(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(jVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < cVarArr.length) {
                        try {
                            c cVar2 = cVarArr[i10];
                            v(byteArrayOutputStream3, i10);
                            v(byteArrayOutputStream3, cVar2.f14234e);
                            i11 = i11 + 4 + (cVar2.f14234e * i8);
                            int[] iArr = cVar2.f14237h;
                            int length3 = iArr.length;
                            int i12 = i4;
                            int i13 = i8;
                            int i14 = i12;
                            while (i14 < length3) {
                                int i15 = iArr[i14];
                                v(byteArrayOutputStream3, i15 - i12);
                                i14++;
                                i12 = i15;
                            }
                            i10++;
                            i8 = i13;
                            i4 = 0;
                        } catch (Throwable th) {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i11 == byteArray2.length) {
                        j jVar2 = new j(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(jVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < cVarArr.length) {
                            try {
                                c cVar3 = cVarArr[i16];
                                Iterator it = cVar3.f14238i.entrySet().iterator();
                                int i18 = 0;
                                while (it.hasNext()) {
                                    i18 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    r(byteArrayOutputStream4, i18, cVar3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        s(byteArrayOutputStream4, cVar3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        v(byteArrayOutputStream3, i16);
                                        int length4 = byteArray3.length + 2 + byteArray4.length;
                                        int i19 = i17 + 6;
                                        ArrayList arrayList4 = arrayList3;
                                        u(byteArrayOutputStream3, length4, 4);
                                        v(byteArrayOutputStream3, i18);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i17 = i19 + length4;
                                        i16++;
                                        arrayList3 = arrayList4;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i17 == byteArray5.length) {
                            j jVar3 = new j(4, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(jVar3);
                            long j8 = 4;
                            long size = j8 + j8 + 4 + (arrayList2.size() * 16);
                            u(byteArrayOutputStream, arrayList2.size(), 4);
                            int i20 = 0;
                            while (i20 < arrayList2.size()) {
                                j jVar4 = (j) arrayList2.get(i20);
                                int i21 = jVar4.f14256a;
                                byte[] bArr3 = jVar4.f14257b;
                                if (i21 != 1) {
                                    if (i21 != 2) {
                                        if (i21 != 3) {
                                            if (i21 != 4) {
                                                if (i21 == 5) {
                                                    j5 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j5 = 3;
                                            }
                                        } else {
                                            j5 = 2;
                                        }
                                    } else {
                                        j5 = 1;
                                    }
                                } else {
                                    j5 = 0;
                                }
                                u(byteArrayOutputStream, j5, 4);
                                u(byteArrayOutputStream, size, 4);
                                if (jVar4.f14258c) {
                                    long length5 = bArr3.length;
                                    byte[] a3 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a3);
                                    u(byteArrayOutputStream, a3.length, 4);
                                    u(byteArrayOutputStream, length5, 4);
                                    length = a3.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    u(byteArrayOutputStream, bArr3.length, 4);
                                    u(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i20++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i22));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        byte[] bArr4 = f14243e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b4 = b(cVarArr, bArr4);
            u(byteArrayOutputStream, cVarArr.length, 1);
            u(byteArrayOutputStream, b4.length, 4);
            byte[] a4 = a(b4);
            u(byteArrayOutputStream, a4.length, 4);
            byteArrayOutputStream.write(a4);
            return true;
        }
        byte[] bArr5 = f14245g;
        if (Arrays.equals(bArr, bArr5)) {
            u(byteArrayOutputStream, cVarArr.length, 1);
            for (c cVar4 : cVarArr) {
                int size2 = cVar4.f14238i.size() * 4;
                String d3 = d(cVar4.f14230a, cVar4.f14231b, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d3.getBytes(charset2).length);
                v(byteArrayOutputStream, cVar4.f14237h.length);
                u(byteArrayOutputStream, size2, 4);
                u(byteArrayOutputStream, cVar4.f14232c, 4);
                byteArrayOutputStream.write(d3.getBytes(charset2));
                Iterator it2 = cVar4.f14238i.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    v(byteArrayOutputStream, 0);
                }
                for (int i23 : cVar4.f14237h) {
                    v(byteArrayOutputStream, i23);
                }
            }
            return true;
        }
        byte[] bArr6 = f14244f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b9 = b(cVarArr, bArr6);
            u(byteArrayOutputStream, cVarArr.length, 1);
            u(byteArrayOutputStream, b9.length, 4);
            byte[] a9 = a(b9);
            u(byteArrayOutputStream, a9.length, 4);
            byteArrayOutputStream.write(a9);
            return true;
        }
        byte[] bArr7 = f14246h;
        if (Arrays.equals(bArr, bArr7)) {
            v(byteArrayOutputStream, cVarArr.length);
            for (c cVar5 : cVarArr) {
                String str = cVar5.f14230a;
                TreeMap treeMap = cVar5.f14238i;
                String d9 = d(str, cVar5.f14231b, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d9.getBytes(charset3).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, cVar5.f14237h.length);
                u(byteArrayOutputStream, cVar5.f14232c, 4);
                byteArrayOutputStream.write(d9.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i24 : cVar5.f14237h) {
                    v(byteArrayOutputStream, i24);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        s(byteArrayOutputStream, cVar);
        int i4 = cVar.f14236g;
        int[] iArr = cVar.f14237h;
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            v(byteArrayOutputStream, i10 - i9);
            i8++;
            i9 = i10;
        }
        byte[] bArr = new byte[(((i4 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f14238i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i11 = intValue / 8;
                bArr[i11] = (byte) (bArr[i11] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i12 = intValue + i4;
                int i13 = i12 / 8;
                bArr[i13] = (byte) ((1 << (i12 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.f14234e);
        u(byteArrayOutputStream, cVar.f14235f, 4);
        u(byteArrayOutputStream, cVar.f14232c, 4);
        u(byteArrayOutputStream, cVar.f14236g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i4, c cVar) {
        int i8 = cVar.f14236g;
        byte[] bArr = new byte[(((Integer.bitCount(i4 & (-2)) * i8) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f14238i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i9 = 0;
            for (int i10 = 1; i10 <= 4; i10 <<= 1) {
                if (i10 != 1 && (i10 & i4) != 0) {
                    if ((i10 & intValue2) == i10) {
                        int i11 = (i9 * i8) + intValue;
                        int i12 = i11 / 8;
                        bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
                    }
                    i9++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i4 = 0;
        for (Map.Entry entry : cVar.f14238i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i4);
                v(byteArrayOutputStream, 0);
                i4 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0198 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Context context, Executor executor, d dVar, boolean z8) {
        boolean z9;
        ?? r72;
        byte[] bArr;
        c[] cVarArr;
        c[] cVarArr2;
        c[] cVarArr3;
        byte[] bArr2;
        boolean z10;
        boolean z11;
        Throwable th;
        Throwable th2;
        boolean z12;
        boolean z13;
        ?? r73;
        boolean z14;
        b bVar;
        String str;
        String str2;
        FileInputStream a3;
        boolean z15;
        boolean z16;
        boolean z17;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z8) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            if (readLong == packageInfo.lastUpdateTime) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                dVar.E(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z17) {
                        context.getPackageName();
                        i.c(context, false);
                        return;
                    }
                }
                z17 = false;
                if (z17) {
                }
            }
            context.getPackageName();
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, dVar, name, file2);
            byte[] bArr3 = bVar2.f14224c;
            if (bArr3 == null) {
                bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        bVar2.b(4, null);
                    }
                    bVar2.f14227f = true;
                    try {
                        try {
                            r72 = bVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e9) {
                            dVar.E(6, e9);
                            r72 = 0;
                            bArr = f14240b;
                            if (r72 != 0) {
                            }
                            cVarArr2 = bVar2.f14228g;
                            if (cVarArr2 != null) {
                            }
                            d dVar2 = bVar2.f14223b;
                            cVarArr3 = bVar2.f14228g;
                            byte[] bArr4 = bVar2.f14224c;
                            boolean z18 = r72;
                            z18 = r72;
                            if (cVarArr3 != null) {
                            }
                            bArr2 = bVar2.f14229h;
                            if (bArr2 != null) {
                            }
                            if (z11) {
                            }
                            z13 = z11;
                            z15 = z12;
                            if (!z13) {
                            }
                            z16 = false;
                            i.c(context, z16);
                        } catch (IOException e10) {
                            dVar.E(7, e10);
                            r72 = 0;
                            bArr = f14240b;
                            if (r72 != 0) {
                            }
                            cVarArr2 = bVar2.f14228g;
                            if (cVarArr2 != null) {
                            }
                            d dVar22 = bVar2.f14223b;
                            cVarArr3 = bVar2.f14228g;
                            byte[] bArr42 = bVar2.f14224c;
                            boolean z182 = r72;
                            z182 = r72;
                            if (cVarArr3 != null) {
                            }
                            bArr2 = bVar2.f14229h;
                            if (bArr2 != null) {
                            }
                            if (z11) {
                            }
                            z13 = z11;
                            z15 = z12;
                            if (!z13) {
                            }
                            z16 = false;
                            i.c(context, z16);
                        }
                        if (r72 != 0) {
                            try {
                            } catch (IOException e11) {
                                dVar.E(7, e11);
                                try {
                                    r72.close();
                                } catch (IOException e12) {
                                    dVar.E(7, e12);
                                }
                                cVarArr = null;
                                bVar2.f14228g = cVarArr;
                                cVarArr2 = bVar2.f14228g;
                                if (cVarArr2 != null) {
                                }
                                d dVar222 = bVar2.f14223b;
                                cVarArr3 = bVar2.f14228g;
                                byte[] bArr422 = bVar2.f14224c;
                                boolean z1822 = r72;
                                z1822 = r72;
                                if (cVarArr3 != null) {
                                }
                                bArr2 = bVar2.f14229h;
                                if (bArr2 != null) {
                                }
                                if (z11) {
                                }
                                z13 = z11;
                                z15 = z12;
                                if (!z13) {
                                }
                                z16 = false;
                                i.c(context, z16);
                            } catch (IllegalStateException e13) {
                                dVar.E(8, e13);
                                r72.close();
                                cVarArr = null;
                                bVar2.f14228g = cVarArr;
                                cVarArr2 = bVar2.f14228g;
                                if (cVarArr2 != null) {
                                }
                                d dVar2222 = bVar2.f14223b;
                                cVarArr3 = bVar2.f14228g;
                                byte[] bArr4222 = bVar2.f14224c;
                                boolean z18222 = r72;
                                z18222 = r72;
                                if (cVarArr3 != null) {
                                }
                                bArr2 = bVar2.f14229h;
                                if (bArr2 != null) {
                                }
                                if (z11) {
                                }
                                z13 = z11;
                                z15 = z12;
                                if (!z13) {
                                }
                                z16 = false;
                                i.c(context, z16);
                            }
                            if (Arrays.equals(bArr, f(r72, 4))) {
                                cVarArr = l(r72, f(r72, 4), bVar2.f14226e);
                                try {
                                    r72.close();
                                } catch (IOException e14) {
                                    dVar.E(7, e14);
                                }
                                bVar2.f14228g = cVarArr;
                            } else {
                                throw new IllegalStateException("Invalid magic");
                            }
                        }
                        cVarArr2 = bVar2.f14228g;
                        if (cVarArr2 != null && ((r72 = Build.VERSION.SDK_INT) >= 31 || r72 == 24 || r72 == 25)) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                a3 = bVar2.a(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e15) {
                                dVar.E(9, e15);
                                str = r72;
                            } catch (IOException e16) {
                                dVar.E(7, e16);
                                str = r72;
                            } catch (IllegalStateException e17) {
                                bVar2.f14228g = null;
                                dVar.E(8, e17);
                                str = r72;
                            }
                            if (a3 == null) {
                                try {
                                    if (Arrays.equals(f14241c, f(a3, 4))) {
                                        byte[] f8 = f(a3, 4);
                                        bVar2.f14228g = i(a3, f8, bArr3, cVarArr2);
                                        a3.close();
                                        bVar = bVar2;
                                        r72 = f8;
                                        if (bVar != null) {
                                            bVar2 = bVar;
                                        }
                                    } else {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                } finally {
                                }
                            } else {
                                if (a3 != null) {
                                    a3.close();
                                    str = str2;
                                }
                                bVar = null;
                                r72 = str;
                                if (bVar != null) {
                                }
                            }
                        }
                        d dVar22222 = bVar2.f14223b;
                        cVarArr3 = bVar2.f14228g;
                        byte[] bArr42222 = bVar2.f14224c;
                        boolean z182222 = r72;
                        z182222 = r72;
                        if (cVarArr3 != null && bArr42222 != null) {
                            r73 = bVar2.f14227f;
                            if (r73 == 0) {
                                try {
                                    r73 = new ByteArrayOutputStream();
                                    try {
                                        r73.write(bArr);
                                        r73.write(bArr42222);
                                    } finally {
                                    }
                                } catch (IOException e18) {
                                    dVar22222.E(7, e18);
                                    z14 = r73;
                                } catch (IllegalStateException e19) {
                                    dVar22222.E(8, e19);
                                    z14 = r73;
                                }
                                if (!o(r73, bArr42222, cVarArr3)) {
                                    dVar22222.E(5, null);
                                    bVar2.f14228g = null;
                                    r73.close();
                                    z182222 = r73;
                                } else {
                                    bVar2.f14229h = r73.toByteArray();
                                    r73.close();
                                    z14 = r73;
                                    bVar2.f14228g = null;
                                    z182222 = z14;
                                }
                            } else {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                        }
                        bArr2 = bVar2.f14229h;
                        if (bArr2 != null) {
                            z11 = false;
                            z12 = true;
                        } else {
                            try {
                                if (bVar2.f14227f) {
                                    try {
                                        try {
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                            try {
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(bVar2.f14225d);
                                                    try {
                                                        try {
                                                            FileChannel channel = fileOutputStream.getChannel();
                                                            try {
                                                                FileLock tryLock = channel.tryLock();
                                                                try {
                                                                    try {
                                                                        if (tryLock != null) {
                                                                            try {
                                                                                if (tryLock.isValid()) {
                                                                                    byte[] bArr5 = new byte[512];
                                                                                    while (true) {
                                                                                        int read = byteArrayInputStream.read(bArr5);
                                                                                        if (read <= 0) {
                                                                                            break;
                                                                                        } else {
                                                                                            fileOutputStream.write(bArr5, 0, read);
                                                                                        }
                                                                                    }
                                                                                    z12 = true;
                                                                                    bVar2.b(1, null);
                                                                                    tryLock.close();
                                                                                    channel.close();
                                                                                    fileOutputStream.close();
                                                                                    byteArrayInputStream.close();
                                                                                    bVar2.f14229h = null;
                                                                                    bVar2.f14228g = null;
                                                                                    z11 = true;
                                                                                }
                                                                            } catch (Throwable th3) {
                                                                                th = th3;
                                                                                Throwable th4 = th;
                                                                                if (tryLock != null) {
                                                                                    try {
                                                                                        tryLock.close();
                                                                                        throw th4;
                                                                                    } catch (Throwable th5) {
                                                                                        th4.addSuppressed(th5);
                                                                                        throw th4;
                                                                                    }
                                                                                }
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                        throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        Throwable th7 = th;
                                                                        if (channel != null) {
                                                                            try {
                                                                                channel.close();
                                                                                throw th7;
                                                                            } catch (Throwable th8) {
                                                                                th7.addSuppressed(th8);
                                                                                throw th7;
                                                                            }
                                                                        }
                                                                        throw th7;
                                                                    }
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            th2 = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th2;
                                                            } catch (Throwable th12) {
                                                                th2.addSuppressed(th12);
                                                                throw th2;
                                                            }
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        th2 = th;
                                                        fileOutputStream.close();
                                                        throw th2;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    th = th;
                                                    try {
                                                        byteArrayInputStream.close();
                                                        throw th;
                                                    } catch (Throwable th15) {
                                                        th.addSuppressed(th15);
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                                th = th;
                                                byteArrayInputStream.close();
                                                throw th;
                                            }
                                        } catch (FileNotFoundException e20) {
                                            e = e20;
                                            bVar2.b(6, e);
                                            z10 = z182222;
                                            z11 = false;
                                            z12 = z10;
                                            if (z11) {
                                            }
                                            z13 = z11;
                                            z15 = z12;
                                            if (!z13) {
                                            }
                                            z16 = false;
                                            i.c(context, z16);
                                        } catch (IOException e21) {
                                            e = e21;
                                            bVar2.b(7, e);
                                            z10 = z182222;
                                            z11 = false;
                                            z12 = z10;
                                            if (z11) {
                                            }
                                            z13 = z11;
                                            z15 = z12;
                                            if (!z13) {
                                            }
                                            z16 = false;
                                            i.c(context, z16);
                                        }
                                    } catch (FileNotFoundException e22) {
                                        e = e22;
                                        z182222 = true;
                                        bVar2.b(6, e);
                                        z10 = z182222;
                                        z11 = false;
                                        z12 = z10;
                                        if (z11) {
                                        }
                                        z13 = z11;
                                        z15 = z12;
                                        if (!z13) {
                                        }
                                        z16 = false;
                                        i.c(context, z16);
                                    } catch (IOException e23) {
                                        e = e23;
                                        z182222 = true;
                                        bVar2.b(7, e);
                                        z10 = z182222;
                                        z11 = false;
                                        z12 = z10;
                                        if (z11) {
                                        }
                                        z13 = z11;
                                        z15 = z12;
                                        if (!z13) {
                                        }
                                        z16 = false;
                                        i.c(context, z16);
                                    }
                                } else {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                            } finally {
                                bVar2.f14229h = null;
                                bVar2.f14228g = null;
                            }
                        }
                        if (z11) {
                            e(packageInfo, filesDir);
                        }
                        z13 = z11;
                        z15 = z12;
                    } finally {
                    }
                    bArr = f14240b;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            bVar2.b(4, null);
                        }
                        bVar2.f14227f = true;
                        r72 = bVar2.a(assets, "dexopt/baseline.prof");
                        bArr = f14240b;
                        if (r72 != 0) {
                        }
                        cVarArr2 = bVar2.f14228g;
                        if (cVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            a3 = bVar2.a(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (a3 == null) {
                            }
                        }
                        d dVar222222 = bVar2.f14223b;
                        cVarArr3 = bVar2.f14228g;
                        byte[] bArr422222 = bVar2.f14224c;
                        boolean z1822222 = r72;
                        z1822222 = r72;
                        if (cVarArr3 != null) {
                            r73 = bVar2.f14227f;
                            if (r73 == 0) {
                            }
                        }
                        bArr2 = bVar2.f14229h;
                        if (bArr2 != null) {
                        }
                        if (z11) {
                        }
                        z13 = z11;
                        z15 = z12;
                    } catch (IOException unused2) {
                        z9 = true;
                        bVar2.b(4, null);
                    }
                }
                if (!z13 && z8) {
                    z16 = z15;
                } else {
                    z16 = false;
                }
                i.c(context, z16);
            }
            z9 = true;
            z13 = false;
            z15 = z9;
            if (!z13) {
            }
            z16 = false;
            i.c(context, z16);
        } catch (PackageManager.NameNotFoundException e24) {
            dVar.E(7, e24);
            i.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j5, int i4) {
        byte[] bArr = new byte[i4];
        for (int i8 = 0; i8 < i4; i8++) {
            bArr[i8] = (byte) ((j5 >> (i8 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        u(byteArrayOutputStream, i4, 2);
    }
}
