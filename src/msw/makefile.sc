

# This file was automatically generated by tmake 
# DO NOT CHANGE THIS FILE, YOUR CHANGES WILL BE LOST! CHANGE SC.T!

# Symantec C++ makefile for the msw objects
# called from src\makefile.sc

# configuration section (see src\makefile.sc) ###########################

WXDIR = $(WXWIN)

include ..\makesc.env

DEBUG=0

LIBTARGET = $(LIBDIR)\wx$(SC_SUFFIX).lib

OPTIONS=

# end of configuration section ##########################################

GENDIR=$(WXDIR)\src\generic
COMMDIR=$(WXDIR)\src\common
HTMLDIR=$(WXDIR)\src\html
OLEDIR=ole
MSWDIR=$(WXDIR)\src\msw

GENERICOBJS= $(GENDIR)\busyinfo.obj \
		$(GENDIR)\calctrl.obj \
		$(GENDIR)\choicdgg.obj \
		$(GENDIR)\dcbuffer.obj \
		$(GENDIR)\dcpsg.obj \
		$(GENDIR)\dirctrlg.obj \
		$(GENDIR)\dragimgg.obj \
		$(GENDIR)\grid.obj \
		$(GENDIR)\gridctrl.obj \
		$(GENDIR)\gridsel.obj \
		$(GENDIR)\laywin.obj \
		$(GENDIR)\logg.obj \
		$(GENDIR)\numdlgg.obj \
		$(GENDIR)\panelg.obj \
		$(GENDIR)\progdlgg.obj \
		$(GENDIR)\sashwin.obj \
		$(GENDIR)\scrlwing.obj \
		$(GENDIR)\spinctlg.obj \
		$(GENDIR)\splash.obj \
		$(GENDIR)\splitter.obj \
		$(GENDIR)\statusbr.obj \
		$(GENDIR)\tbarsmpl.obj \
		$(GENDIR)\textdlgg.obj \
		$(GENDIR)\tipdlg.obj \
		$(GENDIR)\tipwin.obj \
		$(GENDIR)\treectlg.obj \
		$(GENDIR)\wizard.obj

COMMONOBJS = $(COMMDIR)\accesscmn.obj \
		$(COMMDIR)\appcmn.obj \
		$(COMMDIR)\artprov.obj \
		$(COMMDIR)\artstd.obj \
		$(COMMDIR)\choiccmn.obj \
		$(COMMDIR)\clipcmn.obj \
		$(COMMDIR)\clntdata.obj \
		$(COMMDIR)\cmdline.obj \
		$(COMMDIR)\cmdproc.obj \
		$(COMMDIR)\cmndata.obj \
		$(COMMDIR)\config.obj \
		$(COMMDIR)\containr.obj \
		$(COMMDIR)\cshelp.obj \
		$(COMMDIR)\ctrlcmn.obj \
		$(COMMDIR)\ctrlsub.obj \
		$(COMMDIR)\datacmn.obj \
		$(COMMDIR)\datetime.obj \
		$(COMMDIR)\datstrm.obj \
		$(COMMDIR)\db.obj \
		$(COMMDIR)\dbgrid.obj \
		$(COMMDIR)\dbtable.obj \
		$(COMMDIR)\dcbase.obj \
		$(COMMDIR)\dircmn.obj \
		$(COMMDIR)\dlgcmn.obj \
		$(COMMDIR)\dndcmn.obj \
		$(COMMDIR)\dobjcmn.obj \
		$(COMMDIR)\docmdi.obj \
		$(COMMDIR)\docview.obj \
		$(COMMDIR)\dpycmn.obj \
		$(COMMDIR)\dseldlg.obj \
		$(COMMDIR)\dynarray.obj \
		$(COMMDIR)\dynlib.obj \
		$(COMMDIR)\dynload.obj \
		$(COMMDIR)\effects.obj \
		$(COMMDIR)\encconv.obj \
		$(COMMDIR)\event.obj \
		$(COMMDIR)\extended.obj \
		$(COMMDIR)\fddlgcmn.obj \
		$(COMMDIR)\ffile.obj \
		$(COMMDIR)\file.obj \
		$(COMMDIR)\fileconf.obj \
		$(COMMDIR)\filefn.obj \
		$(COMMDIR)\filename.obj \
		$(COMMDIR)\filesys.obj \
		$(COMMDIR)\fontcmn.obj \
		$(COMMDIR)\fontmap.obj \
		$(COMMDIR)\framecmn.obj \
		$(COMMDIR)\fs_inet.obj \
		$(COMMDIR)\fs_mem.obj \
		$(COMMDIR)\fs_zip.obj \
		$(COMMDIR)\ftp.obj \
		$(COMMDIR)\gaugecmn.obj \
		$(COMMDIR)\gdicmn.obj \
		$(COMMDIR)\geometry.obj \
		$(COMMDIR)\gifdecod.obj \
		$(COMMDIR)\hash.obj \
		$(COMMDIR)\hashmap.obj \
		$(COMMDIR)\helpbase.obj \
		$(COMMDIR)\http.obj \
		$(COMMDIR)\iconbndl.obj \
		$(COMMDIR)\imagall.obj \
		$(COMMDIR)\imagbmp.obj \
		$(COMMDIR)\image.obj \
		$(COMMDIR)\imagfill.obj \
		$(COMMDIR)\imaggif.obj \
		$(COMMDIR)\imagiff.obj \
		$(COMMDIR)\imagjpeg.obj \
		$(COMMDIR)\imagpcx.obj \
		$(COMMDIR)\imagpng.obj \
		$(COMMDIR)\imagpnm.obj \
		$(COMMDIR)\imagtiff.obj \
		$(COMMDIR)\imagxpm.obj \
		$(COMMDIR)\intl.obj \
		$(COMMDIR)\ipcbase.obj \
		$(COMMDIR)\layout.obj \
		$(COMMDIR)\lboxcmn.obj \
		$(COMMDIR)\list.obj \
		$(COMMDIR)\log.obj \
		$(COMMDIR)\longlong.obj \
		$(COMMDIR)\matrix.obj \
		$(COMMDIR)\memory.obj \
		$(COMMDIR)\menucmn.obj \
		$(COMMDIR)\mimecmn.obj \
		$(COMMDIR)\module.obj \
		$(COMMDIR)\msgout.obj \
		$(COMMDIR)\mstream.obj \
		$(COMMDIR)\nbkbase.obj \
		$(COMMDIR)\object.obj \
		$(COMMDIR)\paper.obj \
		$(COMMDIR)\popupcmn.obj \
		$(COMMDIR)\prntbase.obj \
		$(COMMDIR)\process.obj \
		$(COMMDIR)\protocol.obj \
		$(COMMDIR)\quantize.obj \
		$(COMMDIR)\radiocmn.obj \
		$(COMMDIR)\regex.obj \
		$(COMMDIR)\rgncmn.obj \
		$(COMMDIR)\sckaddr.obj \
		$(COMMDIR)\sckfile.obj \
		$(COMMDIR)\sckipc.obj \
		$(COMMDIR)\sckstrm.obj \
		$(COMMDIR)\settcmn.obj \
		$(COMMDIR)\sizer.obj \
		$(COMMDIR)\socket.obj \
		$(COMMDIR)\statbar.obj \
		$(COMMDIR)\strconv.obj \
		$(COMMDIR)\stream.obj \
		$(COMMDIR)\string.obj \
		$(COMMDIR)\sysopt.obj \
		$(COMMDIR)\taskbarcmn.obj \
		$(COMMDIR)\tbarbase.obj \
		$(COMMDIR)\textbuf.obj \
		$(COMMDIR)\textcmn.obj \
		$(COMMDIR)\textfile.obj \
		$(COMMDIR)\timercmn.obj \
		$(COMMDIR)\tokenzr.obj \
		$(COMMDIR)\toplvcmn.obj \
		$(COMMDIR)\treebase.obj \
		$(COMMDIR)\txtstrm.obj \
		$(COMMDIR)\unzip.obj \
		$(COMMDIR)\url.obj \
		$(COMMDIR)\utilscmn.obj \
		$(COMMDIR)\valgen.obj \
		$(COMMDIR)\validate.obj \
		$(COMMDIR)\valtext.obj \
		$(COMMDIR)\variant.obj \
		$(COMMDIR)\wfstream.obj \
		$(COMMDIR)\wincmn.obj \
		$(COMMDIR)\wxchar.obj \
		$(COMMDIR)\xpmdecod.obj \
		$(COMMDIR)\zipstrm.obj \
		$(COMMDIR)\zstream.obj

HTMLOBJS = $(HTMLDIR)\helpctrl.obj \
		$(HTMLDIR)\helpdata.obj \
		$(HTMLDIR)\helpfrm.obj \
		$(HTMLDIR)\htmlcell.obj \
		$(HTMLDIR)\htmlfilt.obj \
		$(HTMLDIR)\htmlpars.obj \
		$(HTMLDIR)\htmltag.obj \
		$(HTMLDIR)\htmlwin.obj \
		$(HTMLDIR)\htmprint.obj \
		$(HTMLDIR)\m_dflist.obj \
		$(HTMLDIR)\m_fonts.obj \
		$(HTMLDIR)\m_hline.obj \
		$(HTMLDIR)\m_image.obj \
		$(HTMLDIR)\m_layout.obj \
		$(HTMLDIR)\m_links.obj \
		$(HTMLDIR)\m_list.obj \
		$(HTMLDIR)\m_pre.obj \
		$(HTMLDIR)\m_style.obj \
		$(HTMLDIR)\m_tables.obj \
		$(HTMLDIR)\winpars.obj

MSWOBJS = $(MSWDIR)\accel.obj \
		$(MSWDIR)\ole\access.obj \
		$(MSWDIR)\app.obj \
		$(MSWDIR)\ole\automtn.obj \
		$(MSWDIR)\bitmap.obj \
		$(MSWDIR)\bmpbuttn.obj \
		$(MSWDIR)\brush.obj \
		$(MSWDIR)\button.obj \
		$(MSWDIR)\caret.obj \
		$(MSWDIR)\checkbox.obj \
		$(MSWDIR)\checklst.obj \
		$(MSWDIR)\choice.obj \
		$(MSWDIR)\clipbrd.obj \
		$(MSWDIR)\colordlg.obj \
		$(MSWDIR)\colour.obj \
		$(MSWDIR)\combobox.obj \
		$(MSWDIR)\control.obj \
		$(MSWDIR)\cursor.obj \
		$(MSWDIR)\data.obj \
		$(MSWDIR)\ole\dataobj.obj \
		$(MSWDIR)\dc.obj \
		$(MSWDIR)\dcclient.obj \
		$(MSWDIR)\dcmemory.obj \
		$(MSWDIR)\dcprint.obj \
		$(MSWDIR)\dcscreen.obj \
		$(MSWDIR)\dde.obj \
		$(MSWDIR)\dialog.obj \
		$(MSWDIR)\dialup.obj \
		$(MSWDIR)\dib.obj \
		$(MSWDIR)\dir.obj \
		$(MSWDIR)\dirdlg.obj \
		$(MSWDIR)\display.obj \
		$(MSWDIR)\dragimag.obj \
		$(MSWDIR)\ole\dropsrc.obj \
		$(MSWDIR)\ole\droptgt.obj \
		$(MSWDIR)\enhmeta.obj \
		$(MSWDIR)\evtloop.obj \
		$(MSWDIR)\fdrepdlg.obj \
		$(MSWDIR)\filedlg.obj \
		$(MSWDIR)\font.obj \
		$(MSWDIR)\fontdlg.obj \
		$(MSWDIR)\fontenum.obj \
		$(MSWDIR)\fontutil.obj \
		$(MSWDIR)\frame.obj \
		$(MSWDIR)\gauge95.obj \
		$(MSWDIR)\gdiimage.obj \
		$(MSWDIR)\gdiobj.obj \
		$(MSWDIR)\glcanvas.obj \
		$(MSWDIR)\gsocket.obj \
		$(MSWDIR)\gsockmsw.obj \
		$(MSWDIR)\helpbest.obj \
		$(MSWDIR)\helpchm.obj \
		$(MSWDIR)\helpwin.obj \
		$(MSWDIR)\icon.obj \
		$(MSWDIR)\imaglist.obj \
		$(MSWDIR)\iniconf.obj \
		$(MSWDIR)\joystick.obj \
		$(MSWDIR)\listbox.obj \
		$(MSWDIR)\listctrl.obj \
		$(MSWDIR)\main.obj \
		$(MSWDIR)\mdi.obj \
		$(MSWDIR)\menu.obj \
		$(MSWDIR)\menuitem.obj \
		$(MSWDIR)\metafile.obj \
		$(MSWDIR)\mimetype.obj \
		$(MSWDIR)\minifram.obj \
		$(MSWDIR)\msgdlg.obj \
		$(MSWDIR)\mslu.obj \
		$(MSWDIR)\nativdlg.obj \
		$(MSWDIR)\notebook.obj \
		$(MSWDIR)\ole\oleutils.obj \
		$(MSWDIR)\ownerdrw.obj \
		$(MSWDIR)\palette.obj \
		$(MSWDIR)\pen.obj \
		$(MSWDIR)\penwin.obj \
		$(MSWDIR)\popupwin.obj \
		$(MSWDIR)\printdlg.obj \
		$(MSWDIR)\printwin.obj \
		$(MSWDIR)\radiobox.obj \
		$(MSWDIR)\radiobut.obj \
		$(MSWDIR)\regconf.obj \
		$(MSWDIR)\region.obj \
		$(MSWDIR)\registry.obj \
		$(MSWDIR)\scrolbar.obj \
		$(MSWDIR)\settings.obj \
		$(MSWDIR)\slider95.obj \
		$(MSWDIR)\snglinst.obj \
		$(MSWDIR)\spinbutt.obj \
		$(MSWDIR)\spinctrl.obj \
		$(MSWDIR)\statbmp.obj \
		$(MSWDIR)\statbox.obj \
		$(MSWDIR)\statbr95.obj \
		$(MSWDIR)\statline.obj \
		$(MSWDIR)\stattext.obj \
		$(MSWDIR)\tabctrl.obj \
		$(MSWDIR)\taskbar.obj \
		$(MSWDIR)\tbar95.obj \
		$(MSWDIR)\textctrl.obj \
		$(MSWDIR)\tglbtn.obj \
		$(MSWDIR)\thread.obj \
		$(MSWDIR)\timer.obj \
		$(MSWDIR)\tooltip.obj \
		$(MSWDIR)\toplevel.obj \
		$(MSWDIR)\treectrl.obj \
		$(MSWDIR)\utils.obj \
		$(MSWDIR)\utilsexc.obj \
		$(MSWDIR)\ole\uuid.obj \
		$(MSWDIR)\volume.obj \
		$(MSWDIR)\wave.obj \
		$(MSWDIR)\window.obj

# Add $(NONESSENTIALOBJS) if wanting generic dialogs, PostScript etc.
OBJECTS = $(COMMONOBJS) $(GENERICOBJS) $(MSWOBJS) $(HTMLOBJS) $(WINSOCKLIB)

all: MAKEARCHDIR MAKEWINSOCKLIB $(LIBTARGET) zlib png jpeg tiff regex

MAKEARCHDIR:
    @if not exist $(MSWINCDIR)\setup.h copy $(MSWINCDIR)\setup0.h $(MSWINCDIR)\setup.h
    @if not exist $(ARCHINCDIR)\wx\setup.h mkdir $(ARCHINCDIR)
    @if not exist $(ARCHINCDIR)\wx\setup.h mkdir $(ARCHINCDIR)\wx
    @if not exist $(ARCHINCDIR)\wx\setup.h copy $(MSWINCDIR)\setup.h $(ARCHINCDIR)\wx\setup.h

MAKEWINSOCKLIB:
      if not exist $(WINSOCKLIB) implib  /s $(WINSOCKLIB) $(WINDIR)\system32\wsock32.dll
##    implib /system /v /suffix /Ic:\wx\dm\include\win32 $(WINSOCKLIB) $(WINDIR)\system32\wsock32.dll
##  bug here on win98 no system32 ??
##  implib doesn't work anyway
##    implib  /s $(WINSOCKLIB) $(WINDIR)\system32\winsock.dll
##@if not exist $(WINSOCKLIB)  

$(LIBTARGET): $(OBJECTS)
	-del $(LIBTARGET)
	*lib /PAGESIZE:512 $(LIBTARGET) y $(OBJECTS), nul;

clean: clean_msw clean_zlib clean_png clean_jpeg clean_tiff clean_regex

clean_msw:
	-del $(COMMDIR)\*.obj
	-del $(MSWDIR)\*.obj
	-del $(GENDIR)\*.obj
    -del $(HTMLDIR)\*.obj
	-del *.obj
    -del ole\*.obj
    -del $(LIBTARGET)

png:   
        make -f $(WXDIR)\src\png\makefile.sc FINAL=$(FINAL)

clean_png:
        make -f $(WXDIR)\src\png\makefile.sc clean

zlib:   
        make -f $(WXDIR)\src\zlib\makefile.sc FINAL=$(FINAL) 

clean_zlib:
        make -f $(WXDIR)\src\zlib\makefile.sc clean

jpeg:   
        make -f $(WXDIR)\src\jpeg\makefile.sc FINAL=$(FINAL)

clean_jpeg:
        make -f $(WXDIR)\src\jpeg\makefile.sc clean

regex:  
        make -f $(WXDIR)\src\regex\makefile.sc FINAL=$(FINAL) 

clean_regex:
        make -f $(WXDIR)\src\regex\makefile.sc clean

tiff:  
        make -f $(WXDIR)\src\tiff\makefile.sc FINAL=$(FINAL) 

clean_tiff:
        make -f $(WXDIR)\src\tiff\makefile.sc clean

MFTYPE=sc
makefile.$(MFTYPE) : $(WXWIN)\distrib\msw\tmake\filelist.txt $(WXWIN)\distrib\msw\tmake\$(MFTYPE).t
	cd $(WXWIN)\distrib\msw\tmake
	tmake -t $(MFTYPE) wxwin.pro -o makefile.$(MFTYPE)
	copy makefile.$(MFTYPE) $(WXWIN)\src\msw
