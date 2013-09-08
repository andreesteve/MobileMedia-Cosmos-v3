   
package br.unicamp.ic.sed.mobilemedia.impl.album_mobilephotomgr.impl;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephotomgr.spec.req.IAlbum;


class IAlbumAdapter implements IAlbum{
	
	private br.unicamp.ic.sed.cosmos.IManager manager;
	
	IAlbumAdapter(br.unicamp.ic.sed.cosmos.IManager mgr) {
		this.manager = mgr;
	}
	
	public void initAlbumListScreen ( String[] albumNames ){ //System.out.println("IAlbumAdapter.initAlbumListScreen()");
		
		br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov.IAlbum iAlbum;
		iAlbum = (br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov.IAlbum) manager.getRequiredInterface("IAlbum");
		iAlbum.initAlbumListScreen(albumNames);
	} 
	
	public void initNewAlbumScreen (  ){ //System.out.println("IAlbumAdapter.initNewAlbumScreen()");
		
		br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov.IAlbum iAlbum;
		iAlbum = (br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov.IAlbum) manager.getRequiredInterface("IAlbum");
		iAlbum.initNewAlbumScreen();
	} 
	
	public String getSelectedAlbum (  ){ //System.out.println("IAlbumAdapter.getSelectedAlbum()");
		
		br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov.IAlbum iAlbum;
		iAlbum = (br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov.IAlbum) manager.getRequiredInterface("IAlbum");
		return iAlbum.getSelectedAlbum();	
	} 
	
	public String getNewAlbumName (  ){ //System.out.println("IAlbumAdapter.getNewAlbumName()");
		
		br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov.IAlbum iAlbum;
		iAlbum = (br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov.IAlbum) manager.getRequiredInterface("IAlbum");
		return iAlbum.getNewAlbumName();	
	}

	public void initDeleteAlbumScreen(String currentStoreName) { //System.out.println("IAlbumAdapter.initDeleteAlbumScreen()");
		
		br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov.IAlbum iAlbum;
		iAlbum = (br.unicamp.ic.sed.mobilemedia.impl.album.spec.prov.IAlbum) manager.getRequiredInterface("IAlbum");
		iAlbum.initDeleteAlbumScreen(currentStoreName);
	}
	
}